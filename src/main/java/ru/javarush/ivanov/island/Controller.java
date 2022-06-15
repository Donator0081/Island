package main.java.ru.javarush.ivanov.island;

import main.java.ru.javarush.ivanov.island.entitys.wildlife.Rabbit;
import main.java.ru.javarush.ivanov.island.entitys.wildlife.Rat;
import main.java.ru.javarush.ivanov.island.entitys.wildlife.Snake;
import main.java.ru.javarush.ivanov.island.entitys.wildlife.Wolf;
import main.java.ru.javarush.ivanov.island.servises.PercenterForConsumption;

public class Controller {
    public static void main(String[] args) {
        System.out.println(PercenterForConsumption.getPercents(Wolf.class, Snake.class));

    }
}
