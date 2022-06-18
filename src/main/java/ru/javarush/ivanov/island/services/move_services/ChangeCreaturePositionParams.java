package main.java.ru.javarush.ivanov.island.services.move_services;

import main.java.ru.javarush.ivanov.island.entitys.interfaces.WildLife;
import main.java.ru.javarush.ivanov.island.services.randomizers.RandomizerForMoveLength;
import main.java.ru.javarush.ivanov.island.variables.island_params.IslandWidthAndHeight;

public class ChangeCreaturePositionParams {
    public static void changePositionsParams(WildLife currentUnit, int direction) {
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
