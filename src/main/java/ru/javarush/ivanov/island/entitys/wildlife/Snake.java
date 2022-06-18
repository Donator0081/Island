package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.entitys.interfaces.Eatable;
import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Snake extends Predator implements Eatable {
    private AnimalParams snakeParams = new AnimalParams();
    private int widthNumber;
    private int heightNumber;
    Square squareInfo;

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

    public int getWidthNumber() {
        return widthNumber;
    }

    public void setWidthNumber(int widthNumber) {
        this.widthNumber = widthNumber;
    }

    public int getHeightNumber() {
        return heightNumber;
    }

    public void setHeightNumber(int heightNumber) {
        this.heightNumber = heightNumber;
    }

    @Override
    public Square getSquareInfo() {
        return squareInfo;
    }

    @Override
    public void setSquareInfo(Square squareInfo) {
        this.squareInfo = squareInfo;
    }
}
