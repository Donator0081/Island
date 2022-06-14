package main.java.ru.javarush.ivanov.island.variables.animal_params;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WolfChanceToConsumeList {
    private static Map<String, Integer> chanceToConsume = new ConcurrentHashMap<>();

    private void fillList() {
        chanceToConsume.put("Bear", 0);
        chanceToConsume.put("Boar", 15);
        chanceToConsume.put("Buffalo", 10);
        chanceToConsume.put("Caterpillar", 0);
        chanceToConsume.put("Deer", 15);
        chanceToConsume.put("Duck", 40);
        chanceToConsume.put("Fox", 0);
        chanceToConsume.put("Goat", 60);
        chanceToConsume.put("Hawk", 0);
        chanceToConsume.put("Herbs", 0);
        chanceToConsume.put("Horse", 10);
        chanceToConsume.put("Rabbit", 60);
        chanceToConsume.put("Rat", 80);
        chanceToConsume.put("Sheep", 70);
        chanceToConsume.put("Snake", 0);
        chanceToConsume.put("Wolf", 0);
    }

    public static Map<String, Integer> getList() {
        return chanceToConsume;
    }

}
