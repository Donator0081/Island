package main.java.ru.javarush.ivanov.island.servises.randomizers;

import main.java.ru.javarush.ivanov.island.servises.AnimalAndHerbsFactory;
import main.java.ru.javarush.ivanov.island.servises.WildLife;
import main.java.ru.javarush.ivanov.island.variables.ListOfAnimalsAndHerbs;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomizerForAnimalsPerSquare {

    public static int getResult(WildLife squareWildLife) {
        return ThreadLocalRandom.current().nextInt(1, squareWildLife.getParams().getMaxNumberPerSquare());
    }

    private RandomizerForAnimalsPerSquare() {
    }
}
