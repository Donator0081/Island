package ru.javarush.ivanov.island.services.move_services;

import ru.javarush.ivanov.island.entities.interfaces.WildLife;

import java.util.ArrayList;

public class CheckForMaxNumberAtSquare {

    public static boolean check(WildLife wildLife) {
        boolean result = false;
        int maxNumberAtSquare = wildLife.getParams().getMaxNumberPerSquare();
        ArrayList<WildLife> wildLifeArrayList = new ArrayList<>(wildLife.getSquareInfo().getWildLifeAtSquare());
        int counter = 0;

        for (WildLife unit : wildLifeArrayList) {
            if (unit != null && wildLife.getClass().getSimpleName().equals(unit.getClass().getSimpleName())) {
                counter++;
            }
        }

        if (maxNumberAtSquare < counter) {
            result = true;
        }

        return result;
    }
}
