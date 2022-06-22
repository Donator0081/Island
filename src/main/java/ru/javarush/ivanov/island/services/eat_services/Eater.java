package ru.javarush.ivanov.island.services.eat_services;

import org.jetbrains.annotations.NotNull;
import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.services.randomizers.RandomizerForConsume;
import ru.javarush.ivanov.island.variables.Constants;

import java.util.ArrayList;

public class Eater {

    public static boolean letsEat(@NotNull WildLife currentCreature) {
        Square square = currentCreature.getSquareInfo();
        boolean result = false;
        if (square != null) {
            ArrayList<WildLife> currentSquareList = new ArrayList<>(square.getWildLifeAtSquare());
            for (WildLife unit : currentSquareList) {
                if (!currentCreature.equals(unit) && unit != null) {
                    int percents = PercenterForConsumption.getPercents(currentCreature, unit);
                    boolean resultForEating = RandomizerForConsume.getResult(percents);
                    boolean enoughFoodForEater = CheckAmountOfConsumption.enoughFood(currentCreature, unit);
                    Square unitSquare = unit.getSquareInfo();
                    if (resultForEating && unitSquare != null) {
                        if (enoughFoodForEater) {
                            result = true;
                        }
                        currentSquareList.remove(unit);
                        square.setWildLifeAtSquare(currentSquareList);
                        unit.setSquareInfo(null);
                        break;
                    }
                }
            }
        }
        return result;
    }

    private Eater() {
    }
}
