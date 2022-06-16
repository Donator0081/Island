package main.java.ru.javarush.ivanov.island.servises.randomizers;

import main.java.ru.javarush.ivanov.island.servises.WildLife;

import java.util.concurrent.ThreadLocalRandom;

public class RandomizerForAnimalsPerSquare {

    public static int getResult(WildLife squareWildLife) {
        return ThreadLocalRandom.current().nextInt(1, squareWildLife.getParams().getMaxNumberPerSquare()+1);
    }

    private RandomizerForAnimalsPerSquare() {
    }
}
