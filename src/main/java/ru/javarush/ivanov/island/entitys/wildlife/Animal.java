package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.servises.WildLife;

public abstract class Animal implements WildLife {

    public abstract void eat();

    public abstract void move();

    public abstract void breed();
}
