package main.java.ru.javarush.ivanov.island.servises;

import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public interface WildLife {
    int widthNumber = 0;
    int heightNumber = 0;

    AnimalParams getParams();

    int getWidthNumber();

    void setWidthNumber(int widthNumber);

    int getHeightNumber();

    void setHeightNumber(int heightNumber);
}
