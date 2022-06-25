package ru.javarush.ivanov.island.entities.territory;

import ru.javarush.ivanov.island.entities.wildlife.Creature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Square {

    private Map<String, Set<Creature>> residents = new HashMap<>();
    private int squareNumberWidth;
    private int squareNumberHeight;
    private final Lock lock = new ReentrantLock(true);

    public Square(int squareNumberWidth, int squareNumberHeight) {
        this.squareNumberWidth = squareNumberWidth;
        this.squareNumberHeight = squareNumberHeight;
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

    public Lock getLock() {
        return lock;
    }

    public Map<String, Set<Creature>> getResidents() {
        return residents;
    }

    public void setResidents(Map<String, Set<Creature>> residents) {
        this.residents = residents;
    }

    public boolean remove(Creature creature) {
        if (residents.containsKey(creature)) {
            residents.get(creature).remove(creature);
            return true;
        }
        return false;
    }
}
