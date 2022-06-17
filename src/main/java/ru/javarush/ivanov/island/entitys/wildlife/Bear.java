package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Bear extends Predator {
     private AnimalParams bearParams = new AnimalParams();
    private int widthNumber;
    private int heightNumber;

    public Bear() {
        bearParams.setWeight(500);
        bearParams.setMaxNumberPerSquare(5);
        bearParams.setSpeed(2);
        bearParams.setAmountOfFoodForSatiety(80);
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


    public void setBearParams(AnimalParams bearParams) {
        this.bearParams = bearParams;
    }

    @Override
    public AnimalParams getParams() {
        return bearParams;
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
}
