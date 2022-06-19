package main.java.ru.javarush.ivanov.island.entitys.territory;

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
