package ru.javarush.ivanov.island.services.randomizers;

import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.entities.wildlife.Creature;

import java.util.Set;

public class RandomizerForType {

    public static String getRandomType(Square square, Creature creature){
        Set<String> set = square.getResidents().keySet();
        String result = "";
        for (String s : set) {
            if (!s.equals(creature.getType())) {
                result = s;
                break;
            }
        }
        return result;
    }

    private RandomizerForType() {
    }
}
