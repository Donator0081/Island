package main.java.ru.javarush.ivanov.island.services.move_services;

import main.java.ru.javarush.ivanov.island.entities.interfaces.WildLife;
import main.java.ru.javarush.ivanov.island.services.randomizers.RandomizerForMoveLength;
import main.java.ru.javarush.ivanov.island.variables.Constants;
import main.java.ru.javarush.ivanov.island.variables.island_params.IslandWidthAndHeight;

public class MoveToOtherSquare {
    public static void moveToOtherSquare(WildLife currentUnit, int direction) {
        int rnd = RandomizerForMoveLength.getResult(currentUnit.getParams().getSpeed());
        switch (direction) {
            case 1:
                int changedPosition = currentUnit.getSquareInfo().getSquareNumberHeight() - rnd;
                if (changedPosition >= 0) {
                    Constants.ISLAND.getIslandTerritory()[currentUnit.getSquareInfo().getSquareNumberWidth()]
                            [changedPosition].getWildLifeAtSquare().add(currentUnit);
                    Constants.ISLAND.getIslandTerritory()[currentUnit.getSquareInfo().getSquareNumberWidth()]
                            [currentUnit.getSquareInfo().getSquareNumberHeight()].getWildLifeAtSquare().remove(currentUnit);
                    currentUnit.setSquareInfo(Constants.ISLAND.getIslandTerritory()[currentUnit.getSquareInfo().getSquareNumberWidth()]
                            [changedPosition]);
                }
                break;

            case 2:
                changedPosition = currentUnit.getSquareInfo().getSquareNumberWidth() + rnd;
                if (changedPosition < IslandWidthAndHeight.getWidth()) {
                    Constants.ISLAND.getIslandTerritory()[changedPosition]
                            [currentUnit.getSquareInfo().getSquareNumberHeight()].getWildLifeAtSquare().add(currentUnit);
                    Constants.ISLAND.getIslandTerritory()[currentUnit.getSquareInfo().getSquareNumberWidth()]
                            [currentUnit.getSquareInfo().getSquareNumberHeight()].getWildLifeAtSquare().remove(currentUnit);
                    currentUnit.setSquareInfo(Constants.ISLAND.getIslandTerritory()[changedPosition]
                            [currentUnit.getSquareInfo().getSquareNumberHeight()]);
                }
                break;

            case 3:
                changedPosition = currentUnit.getSquareInfo().getSquareNumberHeight() + rnd;
                if (changedPosition < IslandWidthAndHeight.getHeight()) {
                    Constants.ISLAND.getIslandTerritory()[currentUnit.getSquareInfo().getSquareNumberWidth()]
                            [changedPosition].getWildLifeAtSquare().add(currentUnit);
                    Constants.ISLAND.getIslandTerritory()[currentUnit.getSquareInfo().getSquareNumberWidth()]
                            [currentUnit.getSquareInfo().getSquareNumberHeight()].getWildLifeAtSquare().remove(currentUnit);
                    currentUnit.setSquareInfo(Constants.ISLAND.getIslandTerritory()[currentUnit.getSquareInfo().getSquareNumberWidth()]
                            [changedPosition]);
                }
                break;

            case 4:
                changedPosition = currentUnit.getSquareInfo().getSquareNumberWidth() - rnd;
                if (changedPosition >= 0) {
                    Constants.ISLAND.getIslandTerritory()[changedPosition]
                            [currentUnit.getSquareInfo().getSquareNumberHeight()].getWildLifeAtSquare().add(currentUnit);
                    Constants.ISLAND.getIslandTerritory()[currentUnit.getSquareInfo().getSquareNumberWidth()]
                            [currentUnit.getSquareInfo().getSquareNumberHeight()].getWildLifeAtSquare().remove(currentUnit);
                    currentUnit.setSquareInfo(Constants.ISLAND.getIslandTerritory()[changedPosition]
                            [currentUnit.getSquareInfo().getSquareNumberHeight()]);
                }
                break;
        }
    }
}
