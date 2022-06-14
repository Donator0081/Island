package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Caterpillar extends Animal {
    AnimalParams caterpillarParams = new AnimalParams();

    public Caterpillar() {
        caterpillarParams.setWeight(0.01);
        caterpillarParams.setMaxNumberPerSquare(1000);
        caterpillarParams.setSpeed(0);
        caterpillarParams.setAmountOfFoodForSatiety(0);
    }
    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void breed() {

    }
}
