package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Sheep extends Herbivorous {
    private AnimalParams sheepParams = new AnimalParams();
    private int widthNumber;
    private int heightNumber;

    public Sheep() {
        sheepParams.setWeight(70);
        sheepParams.setMaxNumberPerSquare(140);
        sheepParams.setSpeed(3);
        sheepParams.setAmountOfFoodForSatiety(150);
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

    public void setSheepParams(AnimalParams sheepParams) {
        this.sheepParams = sheepParams;
    }

    @Override
    public AnimalParams getParams() {
        return sheepParams;
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
