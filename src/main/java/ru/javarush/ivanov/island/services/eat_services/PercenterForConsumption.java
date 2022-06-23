package ru.javarush.ivanov.island.services.eat_services;


import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.variables.consume_lists_factory.ChanceToConsumeFactory;
import ru.javarush.ivanov.island.variables.ListOfAnimalsAndHerbs;

import java.util.Optional;

public class PercenterForConsumption {

    public synchronized static int getPercents(WildLife firstClazz, WildLife secondClazz) {
        if (firstClazz != null && secondClazz != null) {
            ListOfAnimalsAndHerbs first = ListOfAnimalsAndHerbs.valueOf(firstClazz.getClass().getSimpleName().toUpperCase());
            return ChanceToConsumeFactory.createConsumeList(first).getList().get(secondClazz.getClass().getSimpleName());
        }
        return 0;
    }

    private PercenterForConsumption() {
    }
}
