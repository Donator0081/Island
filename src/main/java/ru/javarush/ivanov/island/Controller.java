package main.java.ru.javarush.ivanov.island;

import main.java.ru.javarush.ivanov.island.entitys.wildlife.*;
import main.java.ru.javarush.ivanov.island.servises.PercenterForConsumption;
import main.java.ru.javarush.ivanov.island.servises.randomizers.RandomizerForConsume;

public class Controller {
    public static void main(String[] args) {
        while (true){
            System.out.println(RandomizerForConsume.getResult(PercenterForConsumption.getPercents(Wolf.class,Rabbit.class)));
        }

    }
}
