package main.java.ru.javarush.ivanov.island.servises.consume_lists;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BuffaloChanceToConsumeList extends ChanceToConsumeList {
    private static Map<String, Integer> chanceToConsume = new ConcurrentHashMap<>();

    static {
        chanceToConsume.put("Bear", 0);
        chanceToConsume.put("Boar", 0);
        chanceToConsume.put("Buffalo", 0);
        chanceToConsume.put("Caterpillar", 0);
        chanceToConsume.put("Deer", 0);
        chanceToConsume.put("Duck", 0);
        chanceToConsume.put("Fox", 0);
        chanceToConsume.put("Goat", 0);
        chanceToConsume.put("Hawk", 0);
        chanceToConsume.put("Herbs", 100);
        chanceToConsume.put("Horse", 0);
        chanceToConsume.put("Rabbit", 0);
        chanceToConsume.put("Rat", 0);
        chanceToConsume.put("Sheep", 0);
        chanceToConsume.put("Snake", 0);
        chanceToConsume.put("Wolf", 0);
    }

    public BuffaloChanceToConsumeList() {
    }

    public  Map<String, Integer> getList() {
        return chanceToConsume;
    }


}
