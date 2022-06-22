package ru.javarush.ivanov.island.entities.wildlife;


import ru.javarush.ivanov.island.entities.interfaces.WildLife;

public abstract class Herbivorous extends Animal {
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public WildLife breed() {
        return super.breed();
    }
}
