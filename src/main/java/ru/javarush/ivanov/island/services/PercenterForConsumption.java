package main.java.ru.javarush.ivanov.island.services;

import main.java.ru.javarush.ivanov.island.entitys.interfaces.WildLife;
import main.java.ru.javarush.ivanov.island.variables.consume_lists_factory.ChanceToConsumeFactory;
import main.java.ru.javarush.ivanov.island.variables.ListOfAnimalsAndHerbs;

public class PercenterForConsumption {

    public static int getPercents(Class<? extends WildLife> firstClazz, Class<? extends WildLife> secondClazz) {
        ListOfAnimalsAndHerbs first = ListOfAnimalsAndHerbs.valueOf(firstClazz.getSimpleName().toUpperCase());
        return ChanceToConsumeFactory.createConsumeList(first).getList().get(secondClazz.getSimpleName());
    }

    private PercenterForConsumption() {
    }
}
