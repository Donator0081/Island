package ru.javarush.ivanov.island.entities.territory;

import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.wildlife.Animal;
import ru.javarush.ivanov.island.entities.wildlife.Herbs;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Square extends Thread{

    private ArrayList<WildLife> wildLifeAtSquare;
    private int squareNumberWidth;
    private int squareNumberHeight;
    private static final ArrayList<WildLife> LIST_FOR_BREED = new ArrayList<>();

    public ArrayList<WildLife> getWildLifeAtSquare() {
        return wildLifeAtSquare;
    }

    public void setWildLifeAtSquare(ArrayList<WildLife> wildLifeAtSquare) {
        this.wildLifeAtSquare = wildLifeAtSquare;
    }

    public Square(int squareNumberWidth, int squareNumberHeight) {
        this.squareNumberWidth = squareNumberWidth;
        this.squareNumberHeight = squareNumberHeight;
        new Thread(this);
    }

    public int getSquareNumberWidth() {
        return squareNumberWidth;
    }

    public void setSquareNumberWidth(int squareNumberWidth) {
        this.squareNumberWidth = squareNumberWidth;
    }

    public int getSquareNumberHeight() {
        return squareNumberHeight;
    }

    public void setSquareNumberHeight(int squareNumberHeight) {
        this.squareNumberHeight = squareNumberHeight;
    }

    @Override
    public void run() {
        ArrayList<WildLife> tempList = new ArrayList<>(wildLifeAtSquare);
        for (WildLife currentCreature : tempList) {
            if (!currentCreature.getClass().equals(Herbs.class)) {
                Animal animal = (Animal) currentCreature;
                animal.eat();
                LIST_FOR_BREED.add(animal.breed());
                animal.move();
            }
        }
        wildLifeAtSquare.addAll(LIST_FOR_BREED);
        try {
            Thread.currentThread().wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
