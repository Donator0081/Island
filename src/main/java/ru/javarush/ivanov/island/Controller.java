package main.java.ru.javarush.ivanov.island;

import main.java.ru.javarush.ivanov.island.entitys.territory.Island;
import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.servises.IslandFiller;
import main.java.ru.javarush.ivanov.island.servises.randomizers.RandomizerForMoveLength;


public class Controller {
    public static void main(String[] args) {
        Island island = new Island();
        island.setIslandTerritory(IslandFiller.getFilled(100, 20));
        Square square = island.getIslandTerritory()[0][19];
        square.getWildLifeAtSquare().get(3).getParams().getSpeed();
        int i = RandomizerForMoveLength.getResult(square.getWildLifeAtSquare().get(3).getParams().getSpeed());
        System.out.println(i);
        System.out.println(square.getWildLifeAtSquare().size());
        System.out.println("W " + square.getSquareNumberWidth());
        System.out.println("H " + square.getSquareNumberHeight());
        System.out.println(square.getWildLifeAtSquare().get(3).getClass().getSimpleName());
    }
}
