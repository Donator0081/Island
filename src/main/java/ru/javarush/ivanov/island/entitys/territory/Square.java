package main.java.ru.javarush.ivanov.island.entitys.territory;

import main.java.ru.javarush.ivanov.island.entitys.interfaces.WildLife;

import java.util.ArrayList;

public class Square {
    private ArrayList<WildLife> wildLifeAtSquare;
    private int squareNumberWidth;
    private int squareNumberHeight;

    public ArrayList<WildLife> getWildLifeAtSquare() {
        return wildLifeAtSquare;
    }

    public void setWildLifeAtSquare(ArrayList<WildLife> wildLifeAtSquare) {
        this.wildLifeAtSquare = wildLifeAtSquare;
    }

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
}
