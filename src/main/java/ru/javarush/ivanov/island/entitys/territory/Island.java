package main.java.ru.javarush.ivanov.island.entitys.territory;

public class Island {
    private Square[][] islandTerritory;
    private int width;
    private int height;

    public Square[][] getIslandTerritory() {
        return islandTerritory;
    }

    public void setIslandTerritory(Square[][] islandTerritory) {
        this.islandTerritory = islandTerritory;
        this.width = islandTerritory.length;
        this.height = islandTerritory[0].length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
