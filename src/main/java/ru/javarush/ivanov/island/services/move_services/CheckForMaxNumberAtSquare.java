package main.java.ru.javarush.ivanov.island.services.move_services;

import main.java.ru.javarush.ivanov.island.entitys.interfaces.WildLife;
import main.java.ru.javarush.ivanov.island.entitys.territory.Square;

public class CheckForMaxNumberAtSquare {

    public static boolean check(Square square, WildLife wildLife) {
        boolean result = false;
        int maxNumberAtSquare = wildLife.getParams().getMaxNumberPerSquare();
        int counter = 0;

        for (WildLife unit : square.getWildLifeAtSquare()) {
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