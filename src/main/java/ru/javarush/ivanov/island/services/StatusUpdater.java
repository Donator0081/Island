package ru.javarush.ivanov.island.services;

import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.variables.Constants;
import ru.javarush.ivanov.island.variables.island_params.IslandWidthAndHeight;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class StatusUpdater implements Runnable {
    private void update() {
        for (int i = 0; i < IslandWidthAndHeight.getWidth(); i++) {
            for (int j = 0; j < IslandWidthAndHeight.getHeight(); j++) {
                Square square = Constants.ISLAND.getIslandTerritory()[i][j];
                square.notify();
                square.start();
            }
        }
    }

    @Override
    public void run() {
        update();
    }

    public StatusUpdater() {
        new Thread(this);
    }
}