package ru.javarush.ivanov.island.services.move_services;

import org.jetbrains.annotations.NotNull;
import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.wildlife.Creature;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CheckForMaxNumberAtSquare {

    public static boolean check(@NotNull Creature creature) {
        boolean result = false;
        int maxNumberAtSquare = creature.getParams().getMaxNumberPerSquare();
        String type = creature.getType();
        Set<Creature> amountOfCreatures = new HashSet<>(creature.getSquareInfo().getResidents().get(type));
        int counter = amountOfCreatures.size();
        if (maxNumberAtSquare < counter) {
            result = true;
        }

        return result;
    }


}
