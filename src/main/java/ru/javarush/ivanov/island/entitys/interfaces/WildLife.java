package main.java.ru.javarush.ivanov.island.entitys.interfaces;

import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.services.move_services.ChangeCreaturePositionParams;
import main.java.ru.javarush.ivanov.island.services.randomizers.RandomizerForMoveDirection;
import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public interface WildLife {

    AnimalParams getParams();

    int getWidthNumber();

    void setWidthNumber(int widthNumber);

    int getHeightNumber();

    void setHeightNumber(int heightNumber);

    Square getSquareInfo();

    void setSquareInfo(Square squareInfo);
}
