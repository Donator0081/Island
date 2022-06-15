package main.java.ru.javarush.ivanov.island.servises;

import main.java.ru.javarush.ivanov.island.variables.ListOfAnimalsAndHerbs;

public class PercenterForConsumption {

    public static int getPercents(Class<? extends WildLife> firstClazz, Class<? extends WildLife> secondClazz) {
        ListOfAnimalsAndHerbs first = ListOfAnimalsAndHerbs.valueOf(firstClazz.getSimpleName().toUpperCase());
        int result = 1;
        try {
            result = ChanceToConsumeFactory.createConsumeList(first).getList().get(secondClazz.getSimpleName());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return result;
    }

    private PercenterForConsumption() {
    }
}
