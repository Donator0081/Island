package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Buffalo extends Herbivorous {
    private AnimalParams buffaloParams = new AnimalParams();
    private int widthNumber;
    private int heightNumber;
    Square squareInfo;

    public Buffalo() {
        buffaloParams.setWeight(700);
        buffaloParams.setMaxNumberPerSquare(10);
        buffaloParams.setSpeed(3);
        buffaloParams.setAmountOfFoodForSatiety(100);
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


    public void setBuffaloParams(AnimalParams buffaloParams) {
        this.buffaloParams = buffaloParams;
    }

    @Override
    public AnimalParams getParams() {
        return buffaloParams;
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
