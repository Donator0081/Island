package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Sheep extends Herbivorous {
    AnimalParams sheepParams = new AnimalParams();

    public Sheep() {
        sheepParams.setWeight(70);
        sheepParams.setMaxNumberPerSquare(140);
        sheepParams.setSpeed(3);
        sheepParams.setAmountOfFoodForSatiety(150);
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
