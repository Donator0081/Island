package main.java.ru.javarush.ivanov.island.servises;

import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.servises.SquareFiller;


public class IslandFiller {
    public static Square[][] getFilled(int length, int height) {
        Square[][] result = new Square[length][height];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                Square square = new Square();
                square.setWildLifeAtSquare(SquareFiller.getFilled());
                result[i][j] = square;
            }
        }
        return result;
    }

    private IslandFiller() {
    }
}
