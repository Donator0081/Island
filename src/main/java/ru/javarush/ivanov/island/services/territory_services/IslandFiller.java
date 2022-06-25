package ru.javarush.ivanov.island.services.territory_services;

import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.wildlife.Creature;
import ru.javarush.ivanov.island.variables.ListOfAnimalsAndHerbs;
import ru.javarush.ivanov.island.variables.island_params.IslandWidthAndHeight;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IslandFiller {
    public static Square[][] getFilled() {
        int height = IslandWidthAndHeight.getHeight();
        int width = IslandWidthAndHeight.getWidth();
        Square[][] result = new Square[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Square square = new Square(i, j);
                square.setResidents(SquareFiller.getFilled());
                creatureInfoFiller(square);
                result[i][j] = square;
            }
        }
        return result;
    }

    private static void creatureInfoFiller(Square square) {
        Set<String> listOfAnimals = ListOfAnimalsAndHerbs.getCurrencies();
        for (String type : listOfAnimals) {
            Set<Creature> set = new HashSet<>(square.getResidents().get(type));
            set.forEach(c -> c.setSquareInfo(square));
        }
    }

    private IslandFiller() {
    }
}
