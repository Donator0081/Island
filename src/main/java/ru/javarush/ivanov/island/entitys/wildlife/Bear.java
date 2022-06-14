package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Bear extends Predator {
    AnimalParams bearParams = new AnimalParams();

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
}
