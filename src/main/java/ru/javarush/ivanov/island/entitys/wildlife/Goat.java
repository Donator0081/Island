package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Goat extends Herbivorous {
    private AnimalParams goatParams = new AnimalParams();

    public Goat() {
        goatParams.setWeight(60);
        goatParams.setMaxNumberPerSquare(140);
        goatParams.setSpeed(3);
        goatParams.setAmountOfFoodForSatiety(10);
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

    public void setGoatParams(AnimalParams goatParams) {
        this.goatParams = goatParams;
    }

    @Override
    public AnimalParams getParams() {
        return goatParams;
    }
}
