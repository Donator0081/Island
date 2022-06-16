package main.java.ru.javarush.ivanov.island.entitys.territory;

import main.java.ru.javarush.ivanov.island.servises.WildLife;

import java.util.ArrayList;

public class Island {
    private Square[][] islandTerritory;

    public Square[][] getIslandTerritory() {
        return islandTerritory;
    }

    public void setIslandTerritory(Square[][] islandTerritory) {
        this.islandTerritory = islandTerritory;
    }
}
