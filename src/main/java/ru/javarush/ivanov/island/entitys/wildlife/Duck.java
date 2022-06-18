package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Duck extends Herbivorous {
    private AnimalParams duckParams = new AnimalParams();
    private int widthNumber;
    private int heightNumber;
    Square squareInfo;

    public Duck() {
        duckParams.setWeight(1);
        duckParams.setMaxNumberPerSquare(200);
        duckParams.setSpeed(4);
        duckParams.setAmountOfFoodForSatiety(0.15);
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

    public void setDuckParams(AnimalParams duckParams) {
        this.duckParams = duckParams;
    }

    @Override
    public AnimalParams getParams() {
        return duckParams;
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
