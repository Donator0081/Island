package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Boar extends Herbivorous {
    private AnimalParams boarParams = new AnimalParams();
    private int widthNumber;
    private int heightNumber;

    public Boar() {
        boarParams.setWeight(400);
        boarParams.setMaxNumberPerSquare(50);
        boarParams.setSpeed(2);
        boarParams.setAmountOfFoodForSatiety(50);
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


    public void setBoarParams(AnimalParams boarParams) {
        this.boarParams = boarParams;
    }

    @Override
    public AnimalParams getParams() {
        return boarParams;
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
