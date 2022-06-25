package ru.javarush.ivanov.island.entities.wildlife;

import ru.javarush.ivanov.island.entities.interfaces.Breedable;
import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.services.eat_services.CheckAmountOfConsumption;
import ru.javarush.ivanov.island.services.eat_services.PercenterForConsumption;
import ru.javarush.ivanov.island.services.randomizers.RandomizerForConsume;
import ru.javarush.ivanov.island.services.randomizers.RandomizerForType;
import ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

import java.util.Set;


public abstract class Creature implements WildLife, Breedable {

    private final String type = this.getClass().getSimpleName();
    private AnimalParams params;

    public Creature() {
    }


    protected boolean safeDie(Square square) {
        square.getLock().lock();
        try {
            return square.remove(this);
        } finally {
            square.getLock().unlock();
        }
    }


    protected boolean safeMove(Square source, Square destination) {
        if (safeAddTo(destination)) {
            if (safePollFrom(source)) {
                return true;
            } else {
                safePollFrom(destination);
            }
        }
        return false;
    }

    protected boolean safeAddTo(Square square) {
        square.getLock().lock();
        try {
            Set<Creature> set = square.getResidents().get(type);
            int maxCount = this.getParams().getMaxNumberPerSquare();
            int size = set.size();
            return size < maxCount && set.add(this);
        } finally {
            square.getLock().unlock();
        }
    }

    protected boolean safePollFrom(Square square) {
        square.getLock().lock();
        try {
            return square.getResidents().get(getType()).remove(this);
        } finally {
            square.getLock().unlock();
        }
    }

    protected boolean safeFindFood(Square square) {
        square.getLock().lock();
        try {
            String randomType = RandomizerForType.getRandomType(square, this);
            int chanceToEat = PercenterForConsumption.getPercents(this.getType(), randomType);
            while (chanceToEat < 0) {
                randomType = RandomizerForType.getRandomType(square, this);
                chanceToEat = PercenterForConsumption.getPercents(this.getType(), randomType);
            }
            Set<Creature> set = square.getResidents().get(randomType);
            for (Creature creature : set) {
                boolean resultForEating = RandomizerForConsume.getResult(chanceToEat);
                if (resultForEating) {
                    boolean enoughFoodForEater = CheckAmountOfConsumption.enoughFood(this, creature);
                    if (enoughFoodForEater) {
                        this.getParams().setTurnsToDeath(2);
                    } else {
                        this.getParams().setTurnsToDeath(this.getParams().getTurnsToDeath() - 1);
                        if (this.getParams().getTurnsToDeath() <= 0) {
                            this.setSquareInfo(null);
                            square.getResidents().get(getType()).remove(this);
                            return false;
                        }
                    }
                }
                set.remove(creature);
                creature.setSquareInfo(null);
                return true;
            }
        } finally {
            square.getLock().unlock();
        }
        return false;
    }

    public String getType() {
        return type;
    }

    public AnimalParams getParams() {
        return params;
    }

    public void setParams(AnimalParams params) {
        this.params = params;
    }
}
