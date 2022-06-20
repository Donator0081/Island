package main.java.ru.javarush.ivanov.island.entities.wildlife;

import main.java.ru.javarush.ivanov.island.entities.territory.Square;
import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Caterpillar extends Herbivorous {
    private AnimalParams caterpillarParams = new AnimalParams();
    private Square squareInfo;

    public Caterpillar() {
        caterpillarParams.setWeight(0.01);
        caterpillarParams.setMaxNumberPerSquare(1000);
        caterpillarParams.setSpeed(0);
        caterpillarParams.setAmountOfFoodForSatiety(0);
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

    public void setCaterpillarParams(AnimalParams caterpillarParams) {
        this.caterpillarParams = caterpillarParams;
    }

    @Override
    public AnimalParams getParams() {
        return caterpillarParams;
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
