package main.java.ru.javarush.ivanov.island.services.eat_services;

import main.java.ru.javarush.ivanov.island.entitys.interfaces.WildLife;

public class CheckAmountOfConsumption {
    public static boolean enoughFood(WildLife eater, WildLife victim) {
        double foodNeeded = eater.getParams().getAmountOfFoodForSatiety();
        double foodFromVictim = victim.getParams().getWeight();
        return foodNeeded >= foodFromVictim;
    }
}
