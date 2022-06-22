package ru.javarush.ivanov.island;

import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.entities.wildlife.Animal;
import ru.javarush.ivanov.island.services.StatusUpdater;
import ru.javarush.ivanov.island.services.territory_services.IslandBuilder;
import ru.javarush.ivanov.island.services.territory_services.Statistic;
import ru.javarush.ivanov.island.variables.Constants;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {
    private static final ExecutorService EXECUTOR = Executors.newScheduledThreadPool(3);

    public static void main(String[] args) {
        IslandBuilder islandBuilder = new IslandBuilder();
        Statistic statistic = new Statistic();
        StatusUpdater statusUpdater = new StatusUpdater();
        EXECUTOR.execute(islandBuilder);
        EXECUTOR.execute(statistic);
        EXECUTOR.execute(statusUpdater);
        System.out.println("-------------------------------");
    }
}