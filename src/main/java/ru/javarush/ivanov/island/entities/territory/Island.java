package ru.javarush.ivanov.island.entities.territory;

public class Island {
    private Square[][] islandTerritory;

    public Square[][] getIslandTerritory() {
        return islandTerritory;
    }

    public void setIslandTerritory(Square[][] islandTerritory) {
        this.islandTerritory = islandTerritory;
    }

    public Island(Square[][] islandTerritory) {
        this.islandTerritory = islandTerritory;
    }

}
