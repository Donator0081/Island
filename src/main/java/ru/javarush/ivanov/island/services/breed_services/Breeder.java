package ru.javarush.ivanov.island.services.breed_services;

import org.jetbrains.annotations.NotNull;
import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.entities.wildlife.Animal;
import ru.javarush.ivanov.island.services.AnimalAndHerbsFactory;
import ru.javarush.ivanov.island.services.move_services.CheckForMaxNumberAtSquare;
import ru.javarush.ivanov.island.variables.ListOfAnimalsAndHerbs;

import java.util.ArrayList;

public class Breeder {

    public static WildLife letsBreed(@NotNull WildLife currentCreature) {
        Square square = currentCreature.getSquareInfo();
        WildLife animalOrHerbs = null;
        if (square != null) {
            ArrayList<WildLife> currentSq = new ArrayList<>(square.getWildLifeAtSquare());
            int counter = 0;
            for (WildLife animal : currentSq) {
                if (animal instanceof Animal && animal.getClass().getSimpleName().
                        equals(currentCreature.getClass().getSimpleName())) {
                    counter++;
                }
            }
            if (counter >= 2 && CheckForMaxNumberAtSquare.check(currentCreature)) {
                ListOfAnimalsAndHerbs currentAnimal = ListOfAnimalsAndHerbs.valueOf(currentCreature.getClass().getSimpleName().toUpperCase());
                animalOrHerbs = AnimalAndHerbsFactory.createWildLife(currentAnimal);
            }
        }
        return animalOrHerbs;
    }

    private Breeder() {
    }
}
