package main.java.ru.javarush.ivanov.island.services;

import main.java.ru.javarush.ivanov.island.entitys.interfaces.WildLife;
import main.java.ru.javarush.ivanov.island.entitys.wildlife.*;
import main.java.ru.javarush.ivanov.island.variables.ListOfAnimalsAndHerbs;

public class AnimalAndHerbsFactory {
    public static WildLife createWildLife(ListOfAnimalsAndHerbs listOfAnimalsAndHerbs) {
        return switch (listOfAnimalsAndHerbs) {
            case BEAR -> new Bear();
            case BOAR -> new Boar();
            case BUFFALO -> new Buffalo();
            case CATERPILLAR -> new Caterpillar();
            case DEER -> new Deer();
            case DUCK -> new Duck();
            case FOX -> new Fox();
            case GOAT -> new Goat();
            case HAWK -> new Hawk();
            case HERBS -> new Herbs();
            case HORSE -> new Horse();
            case RABBIT -> new Rabbit();
            case RAT -> new Rat();
            case SHEEP -> new Sheep();
            case SNAKE -> new Snake();
            case WOLF -> new Wolf();
        };
    }

    private AnimalAndHerbsFactory() {
    }
}
