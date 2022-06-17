package main.java.ru.javarush.ivanov.island;

import main.java.ru.javarush.ivanov.island.entitys.territory.Island;
import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.servises.IslandFiller;
import main.java.ru.javarush.ivanov.island.servises.MoveToOtherSquare;
import main.java.ru.javarush.ivanov.island.servises.WildLife;
import main.java.ru.javarush.ivanov.island.servises.randomizers.RandomizerForMoveDirection;
import main.java.ru.javarush.ivanov.island.servises.randomizers.RandomizerForMoveLength;
import main.java.ru.javarush.ivanov.island.variables.island_params.IslandWidthAndHeight;


public class Controller {
    public static void main(String[] args) {
        Island island = new Island();
        IslandWidthAndHeight.setHeight(20);
        IslandWidthAndHeight.setWidth(100);
        int height = IslandWidthAndHeight.getHeight();
        int width = IslandWidthAndHeight.getWidth();
        island.setIslandTerritory(IslandFiller.getFilled(width, height));
        Square square = island.getIslandTerritory()[99][19];
        WildLife current = square.getWildLifeAtSquare().get(5);
        System.out.println(current.getWidthNumber());
        System.out.println(current.getHeightNumber());
        int rndDirection = RandomizerForMoveDirection.getResult();
        MoveToOtherSquare.moveToSquare(current,rndDirection);
        System.out.println(current.getWidthNumber());
        System.out.println(current.getHeightNumber());
    }
}
