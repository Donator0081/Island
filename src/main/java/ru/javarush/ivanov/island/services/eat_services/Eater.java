package main.java.ru.javarush.ivanov.island.services.eat_services;

import main.java.ru.javarush.ivanov.island.entitys.interfaces.WildLife;
import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.services.randomizers.RandomizerForConsume;
import main.java.ru.javarush.ivanov.island.variables.Constants;

import java.util.ArrayList;

public class Eater {

    public static boolean letsEat(WildLife currentCreature) {
        Square square = currentCreature.getSquareInfo();
        ArrayList<WildLife> currentSquareList = square.getWildLifeAtSquare();
        boolean result = false;
        for (WildLife unit : currentSquareList) {
            int percents = PercenterForConsumption.getPercents(currentCreature, unit);
            boolean resultForEating = RandomizerForConsume.getResult(percents);
            boolean enoughFoodForEater = CheckAmountOfConsumption.enoughFood(currentCreature, unit);
            if (resultForEating) {
                if (enoughFoodForEater) {
                    currentCreature.getParams().setTurnsToDeath(2);
                    result = true;
                }
                Constants.ISLAND.getIslandTerritory()[unit.getSquareInfo().getSquareNumberWidth()]
                        [unit.getSquareInfo().getSquareNumberHeight()].getWildLifeAtSquare().remove(unit);
                unit.setSquareInfo(null);
                break;
            }
        }
        return result;
    }

    private Eater() {
    }
}
