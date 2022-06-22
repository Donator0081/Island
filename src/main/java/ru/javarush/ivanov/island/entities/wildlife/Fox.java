package ru.javarush.ivanov.island.entities.wildlife;

import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Fox extends Predator {
    private AnimalParams foxParams = new AnimalParams();
    private Square squareInfo;

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
    public WildLife breed() {
        return super.breed();
    }

    public void setFoxParams(AnimalParams foxParams) {
        this.foxParams = foxParams;
    }

    @Override
    public AnimalParams getParams() {
        return foxParams;
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
