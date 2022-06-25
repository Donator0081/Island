package ru.javarush.ivanov.island.services.territory_services;

import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.wildlife.Creature;
import ru.javarush.ivanov.island.variables.Constants;
import ru.javarush.ivanov.island.variables.ListOfAnimalsAndHerbs;
import ru.javarush.ivanov.island.variables.island_params.IslandWidthAndHeight;

import java.util.*;

public class Statistic {

    public void giveMeStatistic() {
        for (int i = 0; i < IslandWidthAndHeight.getWidth(); i++) {
            for (int j = 0; j < IslandWidthAndHeight.getHeight(); j++) {
                HashMap<String, Set<Creature>> creaturesPerSquare = new HashMap<>(Constants.ISLAND.getIslandTerritory()[i][j].getResidents());
                System.out.println("WildLife at square " + i + " " + j);
                for (String type : ListOfAnimalsAndHerbs.getCurrencies()) {
                    Set<Creature> tempSet = creaturesPerSquare.get(type);
                    System.out.println(type + " : " + tempSet.size());
                }
            }
        }
    }

    public Statistic() {
    }
}

