package ru.javarush.ivanov.island;

import ru.javarush.ivanov.island.threads.IslandWorker;

public class App {
    public static void main(String[] args) {
        IslandWorker islandWorker = new IslandWorker();
        islandWorker.start();
    }
}
