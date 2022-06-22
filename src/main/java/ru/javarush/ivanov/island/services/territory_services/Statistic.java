package ru.javarush.ivanov.island.services.territory_services;

import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.variables.Constants;
import ru.javarush.ivanov.island.variables.ListOfAnimalsAndHerbs;
import ru.javarush.ivanov.island.variables.island_params.IslandWidthAndHeight;

import java.util.*;

public class Statistic implements Runnable {

    private static void giveMeStatistic() {
        HashMap<String, Integer> creaturesPerSquare = new HashMap<>();
        for (ListOfAnimalsAndHerbs unit : ListOfAnimalsAndHerbs.values()) {
            creaturesPerSquare.put(unit.getCurrency(), 0);
        }
        for (int i = 0; i < IslandWidthAndHeight.getWidth(); i++) {
            for (int j = 0; j < IslandWidthAndHeight.getHeight(); j++) {
                ArrayList<WildLife> wildLifeArrayList = new ArrayList<>(Constants.ISLAND.getIslandTerritory()[i][j].getWildLifeAtSquare());
                for (WildLife currentCreature : wildLifeArrayList) {
                    if (currentCreature != null) {
                        String key = currentCreature.getClass().getSimpleName();
                        if (creaturesPerSquare.containsKey(key)) {
                            creaturesPerSquare.put(key, creaturesPerSquare.get(key) + 1);
                        }
                    }
                }
                System.out.println("WildLife at square " + i + " " + j);
                for (Map.Entry<String, Integer> mapUnit : creaturesPerSquare.entrySet()) {
                    System.out.println(mapUnit.getKey() + " : " + mapUnit.getValue());
                    mapUnit.setValue(0);
                }
            }
        }
    }

    @Override
    public void run() {
        giveMeStatistic();
    }

    public Statistic() {
        new Thread(this);
    }
}
