package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.servises.Eatable;
import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Fox extends Predator implements Eatable {
    AnimalParams foxParams = new AnimalParams();

    public Fox() {
        foxParams.setWeight(8);
        foxParams.setMaxNumberPerSquare(30);
        foxParams.setSpeed(2);
        foxParams.setAmountOfFoodForSatiety(2);
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

    @Override
    public void getEaten() {

    }
}
