package main.java.ru.javarush.ivanov.island.servises.consume_lists;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BearChanceToConsumeList extends ChanceToConsumeList {
    private static Map<String, Integer> chanceToConsume = new ConcurrentHashMap<>();

    static {
        chanceToConsume.put("Bear", 0);
        chanceToConsume.put("Boar", 50);
        chanceToConsume.put("Buffalo", 20);
        chanceToConsume.put("Caterpillar", 0);
        chanceToConsume.put("Deer", 80);
        chanceToConsume.put("Duck", 10);
        chanceToConsume.put("Fox", 0);
        chanceToConsume.put("Goat", 70);
        chanceToConsume.put("Hawk", 0);
        chanceToConsume.put("Herbs", 0);
        chanceToConsume.put("Horse", 40);
        chanceToConsume.put("Rabbit", 80);
        chanceToConsume.put("Rat", 90);
        chanceToConsume.put("Sheep", 70);
        chanceToConsume.put("Snake", 80);
        chanceToConsume.put("Wolf", 0);
    }

    public BearChanceToConsumeList() {
    }

    public Map<String, Integer> getList() {
        return chanceToConsume;
    }
}
