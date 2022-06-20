package main.java.ru.javarush.ivanov.island.variables;

import main.java.ru.javarush.ivanov.island.entities.territory.Island;
import main.java.ru.javarush.ivanov.island.services.territory_services.IslandFiller;

public class Constants {
    public static final Island ISLAND = new Island(IslandFiller.getFilled());

    private Constants() {
    }
}
