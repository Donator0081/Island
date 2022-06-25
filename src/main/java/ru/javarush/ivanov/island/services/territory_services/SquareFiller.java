package ru.javarush.ivanov.island.services.territory_services;

import org.jetbrains.annotations.NotNull;
import ru.javarush.ivanov.island.entities.wildlife.Creature;
import ru.javarush.ivanov.island.variables.AnimalAndHerbsFactory;
import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.services.randomizers.RandomizerForAnimalsPerSquare;
import ru.javarush.ivanov.island.variables.ListOfAnimalsAndHerbs;

import java.util.*;

public class SquareFiller {

    public static @NotNull Map<String, Set<Creature>> getFilled() {
        Map<String, Set<Creature>> residents = new HashMap<>();
        for (ListOfAnimalsAndHerbs unit : ListOfAnimalsAndHerbs.values()) {
            Creature animalOrHerbs = AnimalAndHerbsFactory.createWildLife(unit);
            Set<Creature> set = new HashSet<>();
            int rnd = RandomizerForAnimalsPerSquare.getResult(animalOrHerbs);
            for (int i = 0; i < rnd; i++) {
                set.add(AnimalAndHerbsFactory.createWildLife(unit));
            }
            residents.put(animalOrHerbs.getClass().getSimpleName(),set);
        }
        return residents;
    }
}
