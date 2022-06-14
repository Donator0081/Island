package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Rat extends Herbivorous {
    AnimalParams ratParams = new AnimalParams();

    public Rat() {
        ratParams.setWeight(0.05);
        ratParams.setMaxNumberPerSquare(500);
        ratParams.setSpeed(1);
        ratParams.setAmountOfFoodForSatiety(0.01);
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
