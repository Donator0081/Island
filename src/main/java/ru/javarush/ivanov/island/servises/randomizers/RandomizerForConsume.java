package main.java.ru.javarush.ivanov.island.servises.randomizers;

import java.util.concurrent.ThreadLocalRandom;

public class RandomizerForConsume {
    public static boolean getResult(int maxValue) {
        int rnd = ThreadLocalRandom.current().nextInt(0, 100);
        System.out.println(rnd);
        return rnd >= maxValue;
    }
}
