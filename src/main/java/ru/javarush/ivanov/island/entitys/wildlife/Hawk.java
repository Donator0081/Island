package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Hawk extends Predator {
    private AnimalParams hawkParams = new AnimalParams();

    public Hawk() {
        hawkParams.setWeight(6);
        hawkParams.setMaxNumberPerSquare(20);
        hawkParams.setSpeed(3);
        hawkParams.setAmountOfFoodForSatiety(1);
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

    public void setHawkParams(AnimalParams hawkParams) {
        this.hawkParams = hawkParams;
    }

    @Override
    public AnimalParams getParams() {
        return hawkParams;
    }
}