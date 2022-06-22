package ru.javarush.ivanov.island.entities.wildlife;

import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Bear extends Predator {
    private AnimalParams bearParams = new AnimalParams();
    private Square squareInfo;

    public Bear() {
        bearParams.setWeight(500);
        bearParams.setMaxNumberPerSquare(5);
        bearParams.setSpeed(2);
        bearParams.setAmountOfFoodForSatiety(80);
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
    public WildLife breed() {
        return super.breed();
    }

    public void setBearParams(AnimalParams bearParams) {
        this.bearParams = bearParams;
    }

    @Override
    public AnimalParams getParams() {
        return bearParams;
    }

    public Square getSquareInfo() {
        return squareInfo;
    }

    public void setSquareInfo(Square squareInfo) {
        this.squareInfo = squareInfo;
    }
}
