package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Wolf extends Predator {
    private AnimalParams wolfParams = new AnimalParams();
    private Square squareInfo;

    public Wolf() {
        wolfParams.setWeight(50);
        wolfParams.setMaxNumberPerSquare(30);
        wolfParams.setSpeed(3);
        wolfParams.setAmountOfFoodForSatiety(8);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void breed() {
        super.breed();
    }

    public void setWolfParams(AnimalParams wolfParams) {
        this.wolfParams = wolfParams;
    }

    @Override
    public AnimalParams getParams() {
        return wolfParams;
    }

    @Override
    public Square getSquareInfo() {
        return squareInfo;
    }

    @Override
    public void setSquareInfo(Square squareInfo) {
        this.squareInfo = squareInfo;
    }
}
