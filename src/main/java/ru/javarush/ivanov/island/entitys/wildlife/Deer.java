package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Deer extends Herbivorous {
    AnimalParams deerParams = new AnimalParams();

    public Deer() {
        deerParams.setWeight(300);
        deerParams.setMaxNumberPerSquare(20);
        deerParams.setSpeed(4);
        deerParams.setAmountOfFoodForSatiety(50);
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
