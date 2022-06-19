package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.entitys.interfaces.Eatable;
import main.java.ru.javarush.ivanov.island.entitys.interfaces.WildLife;
import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Herbs implements Eatable, WildLife {
    private AnimalParams herbsParams = new AnimalParams();
    Square squareInfo;

    public Herbs() {
        herbsParams.setWeight(1);
        herbsParams.setMaxNumberPerSquare(200);
        herbsParams.setSpeed(0);
        herbsParams.setAmountOfFoodForSatiety(0);
    }
    @Override
    public void getEaten() {

    }

    public void setHerbsParams(AnimalParams herbsParams) {
        this.herbsParams = herbsParams;
    }

    @Override
    public AnimalParams getParams() {
        return herbsParams;
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
