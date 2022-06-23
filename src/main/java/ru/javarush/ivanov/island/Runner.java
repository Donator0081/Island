package ru.javarush.ivanov.island;

import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.entities.wildlife.Animal;
import ru.javarush.ivanov.island.entities.wildlife.AnimalThread;
import ru.javarush.ivanov.island.entities.wildlife.Herbs;
import ru.javarush.ivanov.island.services.territory_services.IslandBuilder;
import ru.javarush.ivanov.island.services.territory_services.Statistic;
import ru.javarush.ivanov.island.variables.Constants;
import ru.javarush.ivanov.island.variables.island_params.IslandWidthAndHeight;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner extends Thread {
    @Override
    public void run() {
        ExecutorService executor = Executors.newScheduledThreadPool(2);
        ExecutorService executorForAnimal = Executors.newFixedThreadPool(5);
        IslandBuilder islandBuilder = new IslandBuilder();
        Statistic statistic = new Statistic();
        executor.submit(islandBuilder);
        while (true) {
            executor.execute(statistic);
            for (int i = 0; i < IslandWidthAndHeight.getWidth(); i++) {
                for (int j = 0; j < IslandWidthAndHeight.getHeight(); j++) {
                    Square square = Constants.ISLAND.getIslandTerritory()[i][j];
                    ArrayList<WildLife> squareList = square.getWildLifeAtSquare();
                    ArrayList<WildLife> tempList = new ArrayList<>(squareList);
                    for (WildLife currentCreature : tempList) {
                        if (!currentCreature.getClass().equals(Herbs.class)) {
                            Animal animal = (Animal) currentCreature;
                            AnimalThread animalThread = new AnimalThread(animal);
                            executorForAnimal.submit(animalThread);
                        }
                    }
                }
            }
        }
    }
}