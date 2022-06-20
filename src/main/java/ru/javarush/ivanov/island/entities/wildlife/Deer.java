package ru.javarush.ivanov.island.entities.wildlife;

import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Deer extends Herbivorous {
    private AnimalParams deerParams = new AnimalParams();
    private Square squareInfo;

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

    public void setDeerParams(AnimalParams deerParams) {
        this.deerParams = deerParams;
    }

    @Override
    public AnimalParams getParams() {
        return deerParams;
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
