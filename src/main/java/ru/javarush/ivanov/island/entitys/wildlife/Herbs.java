package main.java.ru.javarush.ivanov.island.entitys.wildlife;

import main.java.ru.javarush.ivanov.island.servises.Eatable;
import main.java.ru.javarush.ivanov.island.servises.WildLife;
import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public class Herbs implements Eatable, WildLife {
    private AnimalParams herbsParams = new AnimalParams();

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
}
