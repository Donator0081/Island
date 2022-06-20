package main.java.ru.javarush.ivanov.island.services.territory_services;

import main.java.ru.javarush.ivanov.island.services.AnimalAndHerbsFactory;
import main.java.ru.javarush.ivanov.island.entities.interfaces.WildLife;
import main.java.ru.javarush.ivanov.island.services.randomizers.RandomizerForAnimalsPerSquare;
import main.java.ru.javarush.ivanov.island.variables.ListOfAnimalsAndHerbs;

import java.util.ArrayList;

public class SquareFiller {

    public static ArrayList<WildLife> getFilled() {
        ArrayList<WildLife> list = new ArrayList<>();
        for (ListOfAnimalsAndHerbs unit : ListOfAnimalsAndHerbs.values()) {
            WildLife animalOrHerbs = AnimalAndHerbsFactory.createWildLife(unit);
            int rnd = RandomizerForAnimalsPerSquare.getResult(animalOrHerbs);
            for (int i = 0; i < rnd; i++) {
                list.add(AnimalAndHerbsFactory.createWildLife(unit));
            }
        }
        return list;
    }
}
