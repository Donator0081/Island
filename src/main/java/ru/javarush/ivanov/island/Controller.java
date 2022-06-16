package main.java.ru.javarush.ivanov.island;

import main.java.ru.javarush.ivanov.island.entitys.territory.Island;
import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.servises.IslandFiller;
import main.java.ru.javarush.ivanov.island.servises.SquareFiller;

import java.util.Arrays;


public class Controller {
    public static void main(String[] args) {
        Island island = new Island();
        island.setIslandTerritory(IslandFiller.getFilled(100, 20));
        Square square = island.getIslandTerritory()[50][4];
        square.getWildLifeAtSquare().forEach(System.out::println);
        System.out.println(square.getWildLifeAtSquare().size());
        System.out.println(square.getWildLifeAtSquare().get(3).getClass().getSimpleName());
    }
}
