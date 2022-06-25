package ru.javarush.ivanov.island.entities.wildlife;

import ru.javarush.ivanov.island.entities.interfaces.Breedable;
import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.variables.AnimalAndHerbsFactory;
import ru.javarush.ivanov.island.variables.ListOfAnimalsAndHerbs;
import ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

import java.util.Set;

public class Herbs extends Creature implements WildLife {
    private AnimalParams herbsParams = new AnimalParams();
    private Square squareInfo;

    public Herbs() {
        herbsParams.setWeight(1);
        herbsParams.setMaxNumberPerSquare(200);
        herbsParams.setSpeed(0);
        herbsParams.setAmountOfFoodForSatiety(0);
    }

    public void setHerbsParams(AnimalParams herbsParams) {
        this.herbsParams = herbsParams;
    }

    @Override
    public AnimalParams getParams() {
        return herbsParams;
    }

    @Override
    public Square getSquareInfo() {
        return squareInfo;
    }

    @Override
    public void setSquareInfo(Square squareInfo) {
        this.squareInfo = squareInfo;
    }

    @Override
    public boolean breed(Square square) {
        return safeBreed(square);
    }

    private boolean safeBreed(Square square) {
        square.getLock().lock();
        try {
            Set<Creature> herbs = square.getResidents().get(getType());
            if (herbs.size() > 2) {
                herbs.add(AnimalAndHerbsFactory.createWildLife(ListOfAnimalsAndHerbs.valueOf(this.getClass().getSimpleName().toUpperCase())));
                return true;
            }
        } finally {
            square.getLock().unlock();
        }
        return false;
    }
}
