package ru.javarush.ivanov.island.services.territory_services;

import ru.javarush.ivanov.island.variables.island_params.IslandWidthAndHeight;

public class IslandBuilder implements Runnable {

    private static void letsBuild(){
        System.out.println("Our Island");
        for (int i = 0; i < IslandWidthAndHeight.getHeight(); i++) {
            for (int j = 0; j < IslandWidthAndHeight.getWidth(); j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    @Override
    public void run() {
        letsBuild();
    }

    public IslandBuilder() {
    }
}
