package main.java.ru.javarush.ivanov.island.services.breed_services;

import main.java.ru.javarush.ivanov.island.entitys.interfaces.WildLife;
import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.entitys.wildlife.Animal;
import main.java.ru.javarush.ivanov.island.services.AnimalAndHerbsFactory;
import main.java.ru.javarush.ivanov.island.services.move_services.CheckForMaxNumberAtSquare;
import main.java.ru.javarush.ivanov.island.variables.ListOfAnimalsAndHerbs;

import java.util.ArrayList;

public class Breeder {

    public static void letsBreed(Square square, WildLife currentCreature) {
        ArrayList<WildLife> currentSq = square.getWildLifeAtSquare();
        int counter = 0;
        for (WildLife animal : currentSq) {
            if (animal instanceof Animal && animal.getClass().getSimpleName().
                    equals(currentCreature.getClass().getSimpleName())) {
                counter++;
            }
        }
        if (counter > 2 && CheckForMaxNumberAtSquare.check(square, currentCreature)) {
            ListOfAnimalsAndHerbs currentAnimal = ListOfAnimalsAndHerbs.valueOf(currentCreature.getClass().getSimpleName());
            WildLife animalOrHerbs = AnimalAndHerbsFactory.createWildLife(currentAnimal);
            currentSq.add(animalOrHerbs);
            square.setWildLifeAtSquare(currentSq);
        }
    }

    private Breeder() {
    }
}
