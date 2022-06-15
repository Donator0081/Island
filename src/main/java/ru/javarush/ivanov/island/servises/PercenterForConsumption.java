package main.java.ru.javarush.ivanov.island.servises;

import main.java.ru.javarush.ivanov.island.variables.ListOfAnimalsAndHerbs;

public class PercenterForConsumption {

    public static int getPercents(Class<? extends WildLife> firstClazz, Class<? extends WildLife> secondClazz) {
        String first = ListOfAnimalsAndHerbs.valueOf(firstClazz.getSimpleName()).toString();
        String second = ListOfAnimalsAndHerbs.valueOf(secondClazz.getSimpleName()).toString();

        return 0;
    }
}
