package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Deer extends Herbivorous {
    private AnimalParams deerParams = new AnimalParams();
    private int widthNumber;
    private int heightNumber;

    public Deer() {
        deerParams.setWeight(300);
        deerParams.setMaxNumberPerSquare(20);
        deerParams.setSpeed(4);
        deerParams.setAmountOfFoodForSatiety(50);
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

    public void setDeerParams(AnimalParams deerParams) {
        this.deerParams = deerParams;
    }

    @Override
    public AnimalParams getParams() {
        return deerParams;
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
