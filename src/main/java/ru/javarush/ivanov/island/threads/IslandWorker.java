package ru.javarush.ivanov.island.threads;



import ru.javarush.ivanov.island.services.territory_services.IslandBuilder;
import ru.javarush.ivanov.island.services.territory_services.Statistic;
import ru.javarush.ivanov.island.variables.ListOfAnimalsAndHerbs;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class IslandWorker extends Thread {

    @Override
    public void run() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(4);
        Statistic statistic = new Statistic();
        IslandBuilder islandBuilder = new IslandBuilder();
        islandBuilder.letsBuild();
        statistic.giveMeStatistic();
        Set<String> listOfAnimals = ListOfAnimalsAndHerbs.getCurrencies();
        List<AnimalThread> animalThreads = listOfAnimals.stream().map(AnimalThread::new).toList();
        executor.scheduleAtFixedRate(() -> {
            ExecutorService executorForAnimal = Executors.newFixedThreadPool(5);
            animalThreads.forEach(executorForAnimal::submit);
            executorForAnimal.shutdown();
            try {
                if (executorForAnimal.awaitTermination(1000, TimeUnit.MILLISECONDS)) {
                    statistic.giveMeStatistic();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, 1000, 1000, TimeUnit.MILLISECONDS);
    }
}