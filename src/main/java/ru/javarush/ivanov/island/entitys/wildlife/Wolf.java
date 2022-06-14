package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Wolf extends Predator {
    AnimalParams wolfParams = new AnimalParams();

    public Wolf() {
        wolfParams.setWeight(50);
        wolfParams.setMaxNumberPerSquare(30);
        wolfParams.setSpeed(3);
        wolfParams.setAmountOfFoodForSatiety(8);
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
