package main.java.ru.javarush.ivanov.island.servises;

import main.java.ru.javarush.ivanov.island.entitys.territory.Square;

public class IslandFiller {
    public static Square[][] getFilled(int width, int height) {
        Square[][] result = new Square[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Square square = new Square(i, j);
                square.setWildLifeAtSquare(SquareFiller.getFilled());
                result[i][j] = square;
            }
        }
        return result;
    }

    private IslandFiller() {
    }
}
