package main.java.ru.javarush.ivanov.island.servises.randomizers;

import java.util.concurrent.ThreadLocalRandom;

public class RandomizerForMoveLength {
    public static int getResult(int maxMoveLength){
        return ThreadLocalRandom.current().nextInt(1,maxMoveLength+1);
    }

    private RandomizerForMoveLength() {
    }
}
