package main.java.ru.javarush.ivanov.island.services.territory_services;

import main.java.ru.javarush.ivanov.island.entities.territory.Square;
import main.java.ru.javarush.ivanov.island.entities.interfaces.WildLife;
import main.java.ru.javarush.ivanov.island.variables.island_params.IslandWidthAndHeight;

public class IslandFiller {
    public static Square[][] getFilled() {
        int height = IslandWidthAndHeight.getHeight();
        int width = IslandWidthAndHeight.getWidth();
        Square[][] result = new Square[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Square square = new Square(i, j);
                square.setWildLifeAtSquare(SquareFiller.getFilled());
                for (WildLife unit : square.getWildLifeAtSquare()) {
                    unit.setSquareInfo(square);
                }
                result[i][j] = square;
            }
        }
        return result;
    }

    private IslandFiller() {
    }
}
