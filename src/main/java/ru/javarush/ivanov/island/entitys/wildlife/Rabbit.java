package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Rabbit extends Herbivorous {
    private AnimalParams rabbitParams = new AnimalParams();
    private int widthNumber;
    private int heightNumber;

    public Rabbit() {
        rabbitParams.setWeight(2);
        rabbitParams.setMaxNumberPerSquare(150);
        rabbitParams.setSpeed(2);
        rabbitParams.setAmountOfFoodForSatiety(0.45);
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

    public void setRabbitParams(AnimalParams rabbitParams) {
        this.rabbitParams = rabbitParams;
    }

    @Override
    public AnimalParams getParams() {
        return rabbitParams;
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
