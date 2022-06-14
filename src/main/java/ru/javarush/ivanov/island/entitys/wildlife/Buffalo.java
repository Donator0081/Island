package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Buffalo extends Herbivorous {
    AnimalParams buffaloParams = new AnimalParams();

    public Buffalo() {
        buffaloParams.setWeight(700);
        buffaloParams.setMaxNumberPerSquare(10);
        buffaloParams.setSpeed(3);
        buffaloParams.setAmountOfFoodForSatiety(100);
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
