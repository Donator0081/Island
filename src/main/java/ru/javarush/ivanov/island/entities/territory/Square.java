package ru.javarush.ivanov.island.entities.territory;

import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.wildlife.Animal;
import ru.javarush.ivanov.island.entities.wildlife.Herbs;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Square{

    private  volatile ArrayList<WildLife> wildLifeAtSquare;
    private int squareNumberWidth;
    private int squareNumberHeight;

    public synchronized ArrayList<WildLife> getWildLifeAtSquare() {
        return wildLifeAtSquare;
    }

    public synchronized void setWildLifeAtSquare(ArrayList<WildLife> wildLifeAtSquare) {
        this.wildLifeAtSquare = wildLifeAtSquare;
    }

    public Square(int squareNumberWidth, int squareNumberHeight) {
        this.squareNumberWidth = squareNumberWidth;
        this.squareNumberHeight = squareNumberHeight;
    }

    public  int getSquareNumberWidth() {
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

    public synchronized void add(WildLife wildLife){
        wildLifeAtSquare.add(wildLife);
    }

    public synchronized void remove(WildLife wildLife){
        wildLifeAtSquare.remove(wildLife);
    }
}
