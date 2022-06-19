package main.java.ru.javarush.ivanov.island;

import main.java.ru.javarush.ivanov.island.entitys.territory.Island;
import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.entitys.wildlife.Animal;
import main.java.ru.javarush.ivanov.island.variables.Constants;


public class Controller {
    public static void main(String[] args) {
        Island island = Constants.ISLAND;
        Square square = island.getIslandTerritory()[2][5];
//        square.getWildLifeAtSquare().forEach(System.out::println);
        Animal animal = (Animal) square.getWildLifeAtSquare().get(1);
        System.out.println(animal.getClass().getSimpleName());
        System.out.println("Before");
        System.out.println("W " + animal.getSquareInfo().getSquareNumberWidth());
        System.out.println("H " + animal.getSquareInfo().getSquareNumberHeight());
        animal.move();
        System.out.println("After");
        System.out.println("W " + animal.getSquareInfo().getSquareNumberWidth());
        System.out.println("H " + animal.getSquareInfo().getSquareNumberHeight());
//        MoveCreaturesToOtherSquare.moveToSquare(island);
        Animal animal1 = (Animal) square.getWildLifeAtSquare().get(20);
        System.out.println(animal1.getClass().getSimpleName());
        System.out.println("Before");
        System.out.println("W " + animal1.getSquareInfo().getSquareNumberWidth());
        System.out.println("H " + animal1.getSquareInfo().getSquareNumberHeight());
        animal1.move();
        System.out.println("After");
        System.out.println("W " + animal1.getSquareInfo().getSquareNumberWidth());
        System.out.println("H " + animal1.getSquareInfo().getSquareNumberHeight());
    }
}
