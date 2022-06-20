package main.java.ru.javarush.ivanov.island.entities.wildlife;

import main.java.ru.javarush.ivanov.island.entities.territory.Square;
import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Rat extends Herbivorous {
    private AnimalParams ratParams = new AnimalParams();
    private Square squareInfo;

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

    public void setRatParams(AnimalParams ratParams) {
        this.ratParams = ratParams;
    }

    @Override
    public AnimalParams getParams() {
        return ratParams;
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
