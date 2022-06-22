package ru.javarush.ivanov.island.entities.wildlife;

import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Boar extends Herbivorous {
    private AnimalParams boarParams = new AnimalParams();
    private Square squareInfo;

    public Boar() {
        boarParams.setWeight(400);
        boarParams.setMaxNumberPerSquare(50);
        boarParams.setSpeed(2);
        boarParams.setAmountOfFoodForSatiety(50);
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


    public void setBoarParams(AnimalParams boarParams) {
        this.boarParams = boarParams;
    }

    @Override
    public AnimalParams getParams() {
        return boarParams;
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
