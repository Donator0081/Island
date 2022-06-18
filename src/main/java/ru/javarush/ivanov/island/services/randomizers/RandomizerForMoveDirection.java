package main.java.ru.javarush.ivanov.island.services.randomizers;

import java.util.concurrent.ThreadLocalRandom;

public class RandomizerForMoveDirection {
    public static int getResult(){
        return ThreadLocalRandom.current().nextInt(1,5);
    }
}
