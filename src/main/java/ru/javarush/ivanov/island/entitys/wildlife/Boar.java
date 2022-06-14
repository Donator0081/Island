package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Boar extends Herbivorous {
    AnimalParams boarParams = new AnimalParams();

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
}
