package main.java.ru.javarush.ivanov.island.entitys.territory;

import main.java.ru.javarush.ivanov.island.servises.WildLife;

import java.util.ArrayList;

public class Square {
    private ArrayList<WildLife> wildLifeAtSquare;

    public ArrayList<WildLife> getWildLifeAtSquare() {
        return wildLifeAtSquare;
    }

    public void setWildLifeAtSquare(ArrayList<WildLife> wildLifeAtSquare) {
        this.wildLifeAtSquare = wildLifeAtSquare;
    }
}
