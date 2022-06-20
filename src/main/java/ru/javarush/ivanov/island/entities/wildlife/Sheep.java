package main.java.ru.javarush.ivanov.island.entities.wildlife;

import main.java.ru.javarush.ivanov.island.entities.territory.Square;
import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Sheep extends Herbivorous {
    private AnimalParams sheepParams = new AnimalParams();
    private Square squareInfo;

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

    public void setSheepParams(AnimalParams sheepParams) {
        this.sheepParams = sheepParams;
    }

    @Override
    public AnimalParams getParams() {
        return sheepParams;
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
