package ru.javarush.ivanov.island.entities.wildlife;

import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Goat extends Herbivorous {
    private AnimalParams goatParams = new AnimalParams();
    private Square squareInfo;

    public Goat() {
        goatParams.setWeight(60);
        goatParams.setMaxNumberPerSquare(140);
        goatParams.setSpeed(3);
        goatParams.setAmountOfFoodForSatiety(10);
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

    public void setGoatParams(AnimalParams goatParams) {
        this.goatParams = goatParams;
    }

    @Override
    public AnimalParams getParams() {
        return goatParams;
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
