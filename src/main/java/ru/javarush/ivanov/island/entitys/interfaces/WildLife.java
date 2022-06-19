package main.java.ru.javarush.ivanov.island.entitys.interfaces;

import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public interface WildLife {

    AnimalParams getParams();

    Square getSquareInfo();

    void setSquareInfo(Square squareInfo);
}
