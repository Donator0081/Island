package ru.javarush.ivanov.island.entities.territory;

import ru.javarush.ivanov.island.entities.Creature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Square {

    private Map<String, Set<Creature>> residents = new HashMap<>();

    private Square[][] territory;
    private final int squareNumberWidth;
    private final int squareNumberHeight;
    private final Lock lock = new ReentrantLock(true);

    public Square(int squareNumberWidth, int squareNumberHeight) {
        this.squareNumberWidth = squareNumberWidth;
        this.squareNumberHeight = squareNumberHeight;
    }

    public int getSquareNumberWidth() {
        return squareNumberWidth;
    }

    public int getSquareNumberHeight() {
        return squareNumberHeight;
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

    public Square[][] getTerritory() {
        return territory;
    }

    public void setTerritory(Square[][] territory) {
        this.territory = territory;
    }

    public boolean remove(Creature creature) {
        if (residents.containsKey(creature)) {
            residents.get(creature).remove(creature);
            return true;
        }
        return false;
    }
}
