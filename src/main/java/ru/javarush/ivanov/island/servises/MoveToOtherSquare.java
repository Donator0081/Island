package main.java.ru.javarush.ivanov.island.servises;

import main.java.ru.javarush.ivanov.island.servises.randomizers.RandomizerForMoveLength;
import main.java.ru.javarush.ivanov.island.variables.island_params.IslandWidthAndHeight;

public class MoveToOtherSquare {

    public static void moveToSquare(WildLife currentUnit, int direction) {
        int rnd = RandomizerForMoveLength.getResult(currentUnit.getParams().getSpeed());
        switch (direction) {
            case 1:
                int changedPosition = currentUnit.getHeightNumber() - rnd;
                if (changedPosition >= 0) {
                    currentUnit.setHeightNumber(changedPosition);
                }
                break;

            case 2:
                changedPosition = currentUnit.getWidthNumber() + rnd;
                if (changedPosition < IslandWidthAndHeight.getWidth()) {
                    currentUnit.setWidthNumber(changedPosition);
                }
                break;

            case 3:
                changedPosition = currentUnit.getHeightNumber() + rnd;
                if (changedPosition < IslandWidthAndHeight.getHeight()) {
                    currentUnit.setHeightNumber(changedPosition);
                }
                break;

            case 4:
                changedPosition = currentUnit.getWidthNumber() - rnd;
                if (changedPosition >= 0) {
                    currentUnit.setWidthNumber(changedPosition);
                }
                break;
        }
    }
}
