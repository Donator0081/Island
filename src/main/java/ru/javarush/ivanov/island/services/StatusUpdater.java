package ru.javarush.ivanov.island.services;

import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.entities.wildlife.Animal;
import ru.javarush.ivanov.island.entities.wildlife.Herbs;
import ru.javarush.ivanov.island.variables.Constants;
import ru.javarush.ivanov.island.variables.island_params.IslandWidthAndHeight;


import java.util.ArrayList;


public class StatusUpdater {
    private static final ArrayList<WildLife> LIST_FOR_BREED = new ArrayList<>();

    public void update() {
        for (int i = 0; i < IslandWidthAndHeight.getWidth(); i++) {
            for (int j = 0; j < IslandWidthAndHeight.getHeight(); j++) {
                Square square = Constants.ISLAND.getIslandTerritory()[i][j];
                ArrayList<WildLife> squareList = square.getWildLifeAtSquare();
                ArrayList<WildLife> tempList = new ArrayList<>(squareList);
                for (WildLife currentCreature : tempList) {
                    if (!currentCreature.getClass().equals(Herbs.class)) {
                        Animal animal = (Animal) currentCreature;
                        animal.eat();
                        animal.breed();
                        animal.move();
                    }
                }
//                square.getWildLifeAtSquare().addAll(LIST_FOR_BREED);
            }
        }
    }

    public StatusUpdater() {

    }
}