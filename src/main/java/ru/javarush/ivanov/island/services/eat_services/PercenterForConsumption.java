package main.java.ru.javarush.ivanov.island.services.eat_services;

import main.java.ru.javarush.ivanov.island.entitys.interfaces.WildLife;
import main.java.ru.javarush.ivanov.island.variables.consume_lists_factory.ChanceToConsumeFactory;
import main.java.ru.javarush.ivanov.island.variables.ListOfAnimalsAndHerbs;

public class PercenterForConsumption {

    public static int getPercents(WildLife firstClazz, WildLife secondClazz) {
        ListOfAnimalsAndHerbs first = ListOfAnimalsAndHerbs.valueOf(firstClazz.getClass().getSimpleName().toUpperCase());
        return ChanceToConsumeFactory.createConsumeList(first).getList().get(secondClazz.getClass().getSimpleName());
    }

    private PercenterForConsumption() {
    }
}
