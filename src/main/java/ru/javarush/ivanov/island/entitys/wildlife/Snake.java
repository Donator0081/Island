package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.servises.Eatable;
import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Snake extends Predator implements Eatable {
    private AnimalParams snakeParams = new AnimalParams();

    public Snake() {
        snakeParams.setWeight(15);
        snakeParams.setMaxNumberPerSquare(30);
        snakeParams.setSpeed(1);
        snakeParams.setAmountOfFoodForSatiety(3);
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

    public void setSnakeParams(AnimalParams snakeParams) {
        this.snakeParams = snakeParams;
    }

    @Override
    public AnimalParams getParams() {
        return snakeParams;
    }
}