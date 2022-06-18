package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Horse extends Herbivorous {
    private AnimalParams horseParams = new AnimalParams();
    private int widthNumber;
    private int heightNumber;
    Square squareInfo;

    public Horse() {
        horseParams.setWeight(400);
        horseParams.setMaxNumberPerSquare(20);
        horseParams.setSpeed(4);
        horseParams.setAmountOfFoodForSatiety(60);
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

    public void setHorseParams(AnimalParams horseParams) {
        this.horseParams = horseParams;
    }

    @Override
    public AnimalParams getParams() {
        return horseParams;
    }

    public int getWidthNumber() {
        return widthNumber;
    }

    public void setWidthNumber(int widthNumber) {
        this.widthNumber = widthNumber;
    }

    public int getHeightNumber() {
        return heightNumber;
    }

    public void setHeightNumber(int heightNumber) {
        this.heightNumber = heightNumber;
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
