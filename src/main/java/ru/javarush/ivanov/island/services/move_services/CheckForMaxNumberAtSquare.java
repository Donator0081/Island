package main.java.ru.javarush.ivanov.island.services.move_services;

import main.java.ru.javarush.ivanov.island.entities.interfaces.WildLife;

public class CheckForMaxNumberAtSquare {

    public static boolean check(WildLife wildLife) {
        boolean result = false;
        int maxNumberAtSquare = wildLife.getParams().getMaxNumberPerSquare();
        int counter = 0;

        for (WildLife unit : wildLife.getSquareInfo().getWildLifeAtSquare()) {
            if (wildLife.getClass().getSimpleName().equals(unit.getClass().getSimpleName())) {
                counter++;
            }
        }

        if (maxNumberAtSquare < counter) {
            result = true;
        }

        return result;
    }
}
