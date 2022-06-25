package ru.javarush.ivanov.island.services.move_services;

import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.entities.wildlife.Creature;
import ru.javarush.ivanov.island.services.randomizers.RandomizerForMoveLength;
import ru.javarush.ivanov.island.variables.Constants;
import ru.javarush.ivanov.island.variables.island_params.IslandWidthAndHeight;

public class NextSquare {
    public static Square getNextSquare(Creature currentUnit, int direction) {
        int rnd = RandomizerForMoveLength.getResult(currentUnit.getParams().getSpeed());
        Square square = currentUnit.getSquareInfo();
        Square result = square;
        boolean checkForAmount = CheckForMaxNumberAtSquare.check(currentUnit);
        switch (direction) {
            case 1:
                int changedPosition = square.getSquareNumberHeight() - rnd;
                if (changedPosition >= 0 && checkForAmount) {
                    result = Constants.ISLAND.getIslandTerritory()[square.getSquareNumberWidth()]
                            [changedPosition];
                    currentUnit.setSquareInfo(result);
                }
                break;

            case 2:
                changedPosition = square.getSquareNumberWidth() + rnd;
                if (changedPosition < IslandWidthAndHeight.getWidth() && checkForAmount) {
                    result = Constants.ISLAND.getIslandTerritory()[changedPosition]
                            [square.getSquareNumberHeight()];
                    currentUnit.setSquareInfo(result);
                }
                break;

            case 3:
                changedPosition = square.getSquareNumberHeight() + rnd;
                if (changedPosition < IslandWidthAndHeight.getHeight() && checkForAmount) {
                    result = Constants.ISLAND.getIslandTerritory()[square.getSquareNumberWidth()]
                            [changedPosition];
                    currentUnit.setSquareInfo(result);
                }
                break;

            case 4:
                changedPosition = square.getSquareNumberWidth() - rnd;
                if (changedPosition >= 0 && checkForAmount) {
                    result = Constants.ISLAND.getIslandTerritory()[changedPosition]
                            [square.getSquareNumberHeight()];
                    currentUnit.setSquareInfo(result);
                }
                break;
        }
        return result;
    }
}
