package main.java.ru.javarush.ivanov.island.services.breed_services;

import main.java.ru.javarush.ivanov.island.entitys.interfaces.WildLife;
import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.entitys.wildlife.Animal;
import main.java.ru.javarush.ivanov.island.services.AnimalAndHerbsFactory;
import main.java.ru.javarush.ivanov.island.services.move_services.CheckForMaxNumberAtSquare;
import main.java.ru.javarush.ivanov.island.variables.ListOfAnimalsAndHerbs;

import java.util.ArrayList;

public class Breeder {

    public static void letsBreed(WildLife currentCreature) {
        ArrayList<WildLife> currentSq = currentCreature.getSquareInfo().getWildLifeAtSquare();
        int counter = 0;
        for (WildLife animal : currentSq) {
            if (animal instanceof Animal && animal.getClass().getSimpleName().
                    equals(currentCreature.getClass().getSimpleName())) {
                counter++;
            }
        }
        if (counter > 2 && CheckForMaxNumberAtSquare.check(currentCreature)) {
            ListOfAnimalsAndHerbs currentAnimal = ListOfAnimalsAndHerbs.valueOf(currentCreature.getClass().getSimpleName());
            WildLife animalOrHerbs = AnimalAndHerbsFactory.createWildLife(currentAnimal);
            currentSq.add(animalOrHerbs);
            currentCreature.getSquareInfo().setWildLifeAtSquare(currentSq);
        }
    }

    private Breeder() {
    }
}
