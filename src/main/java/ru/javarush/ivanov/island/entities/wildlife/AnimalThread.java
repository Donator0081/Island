package ru.javarush.ivanov.island.entities.wildlife;

import ru.javarush.ivanov.island.entities.territory.Square;

public class AnimalThread implements Runnable {

    private final Animal animal;

    public AnimalThread(Animal animal) {
        this.animal = animal;
    }


    @Override
    public void run() {
        animal.eat();
        animal.breed();
        animal.move();
    }
}
