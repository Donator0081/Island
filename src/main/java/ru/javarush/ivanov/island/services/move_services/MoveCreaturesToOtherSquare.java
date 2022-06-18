package main.java.ru.javarush.ivanov.island.services.move_services;

import main.java.ru.javarush.ivanov.island.entitys.interfaces.WildLife;
import main.java.ru.javarush.ivanov.island.entitys.territory.Island;
import main.java.ru.javarush.ivanov.island.entitys.territory.Square;

import java.util.ArrayList;
import java.util.Arrays;


public class MoveCreaturesToOtherSquare {
    public static void moveToSquare(Island island) {
        for (int i = 0; i < island.getWidth(); i++) {
            for (int j = 0; j < island.getHeight(); j++) {
                Square square = island.getIslandTerritory()[i][j];
                for (WildLife unit : square.getWildLifeAtSquare()) {
                    if (unit.getWidthNumber() != square.getSquareNumberWidth() ||
                            unit.getHeightNumber() != square.getSquareNumberHeight() &&
                                    CheckForMaxNumberAtSquare.check(island.getIslandTerritory()[unit.getWidthNumber()][unit.getHeightNumber()], unit)) {
                        island.getIslandTerritory()[unit.getWidthNumber()][unit.getHeightNumber()].getWildLifeAtSquare().add(unit);
                    }
                }
                ArrayList<WildLife> copy = square.getWildLifeAtSquare();
                copy.removeIf(unit -> unit.getWidthNumber() != square.getSquareNumberWidth() ||
                        unit.getHeightNumber() != square.getSquareNumberHeight());
                square.setWildLifeAtSquare(copy);
            }
        }
    }

    private MoveCreaturesToOtherSquare() {
    }

}
