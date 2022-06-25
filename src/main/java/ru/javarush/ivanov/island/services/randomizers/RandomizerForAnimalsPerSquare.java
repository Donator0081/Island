package ru.javarush.ivanov.island.services.randomizers;

import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.wildlife.Creature;

import java.util.concurrent.ThreadLocalRandom;

public class RandomizerForAnimalsPerSquare {

    public static int getResult(Creature squareWildLife) {
        return ThreadLocalRandom.current().nextInt(1, squareWildLife.getParams().getMaxNumberPerSquare() + 1);
    }

    private RandomizerForAnimalsPerSquare() {
    }
}
