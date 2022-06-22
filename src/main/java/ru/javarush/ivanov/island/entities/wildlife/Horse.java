package ru.javarush.ivanov.island.entities.wildlife;

import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Horse extends Herbivorous {
    private AnimalParams horseParams = new AnimalParams();
    private Square squareInfo;

    public Horse() {
        horseParams.setWeight(400);
        horseParams.setMaxNumberPerSquare(20);
        horseParams.setSpeed(4);
        horseParams.setAmountOfFoodForSatiety(60);
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

    public void setHorseParams(AnimalParams horseParams) {
        this.horseParams = horseParams;
    }

    @Override
    public AnimalParams getParams() {
        return horseParams;
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
