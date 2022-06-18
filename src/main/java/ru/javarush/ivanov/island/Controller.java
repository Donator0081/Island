package main.java.ru.javarush.ivanov.island;

import main.java.ru.javarush.ivanov.island.entitys.interfaces.WildLife;
import main.java.ru.javarush.ivanov.island.entitys.territory.Island;
import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.entitys.wildlife.Animal;
import main.java.ru.javarush.ivanov.island.services.move_services.MoveCreaturesToOtherSquare;
import main.java.ru.javarush.ivanov.island.services.territory_services.IslandFiller;
import main.java.ru.javarush.ivanov.island.variables.island_params.IslandWidthAndHeight;


public class Controller {
    public static void main(String[] args) {
        Island island = new Island();
        IslandWidthAndHeight.setWidth(100);
        IslandWidthAndHeight.setHeight(20);
        int height = IslandWidthAndHeight.getHeight();
        int width = IslandWidthAndHeight.getWidth();
        island.setIslandTerritory(IslandFiller.getFilled(width, height));
        Square square = island.getIslandTerritory()[2][5];
//        square.getWildLifeAtSquare().forEach(System.out::println);
        Animal animal = (Animal) square.getWildLifeAtSquare().get(1);
        System.out.println(animal.getClass().getSimpleName());
        System.out.println("Before");
        System.out.println("W " + animal.getWidthNumber());
        System.out.println("H " + animal.getHeightNumber());
        animal.move();
        System.out.println("After");
        System.out.println("W " + animal.getWidthNumber());
        System.out.println("H " + animal.getHeightNumber());
        MoveCreaturesToOtherSquare.moveToSquare(island);
        Animal animal1 = (Animal) square.getWildLifeAtSquare().get(1);
        System.out.println(animal1.getClass().getSimpleName());
        System.out.println("Before");
        System.out.println("W " + animal1.getWidthNumber());
        System.out.println("H " + animal1.getHeightNumber());
        animal1.move();
        System.out.println("After");
        System.out.println("W " + animal1.getWidthNumber());
        System.out.println("H " + animal1.getHeightNumber());


    }
}
