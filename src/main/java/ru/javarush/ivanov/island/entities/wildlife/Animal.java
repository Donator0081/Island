package ru.javarush.ivanov.island.entities.wildlife;


import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.services.breed_services.Breeder;
import ru.javarush.ivanov.island.services.eat_services.Eater;
import ru.javarush.ivanov.island.services.move_services.MoveToOtherSquare;
import ru.javarush.ivanov.island.services.randomizers.RandomizerForMoveDirection;
import ru.javarush.ivanov.island.variables.Constants;
import ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

import java.util.ArrayList;

public abstract class Animal implements WildLife{
    volatile Square squareInfo;
    AnimalParams animalParams;

    public void eat() {
        if (Eater.letsEat(this)) {
            this.getParams().setTurnsToDeath(2);
        } else if (this.getParams().getTurnsToDeath() <= 0 && this.getSquareInfo() != null) {
            Constants.ISLAND.getIslandTerritory()[this.getSquareInfo().getSquareNumberWidth()]
                    [this.getSquareInfo().getSquareNumberHeight()].getWildLifeAtSquare().remove(this);
            this.setSquareInfo(null);
        } else {
            this.getParams().setTurnsToDeath(this.getParams().getTurnsToDeath() - 1);
        }
    }

    public void move() {
        MoveToOtherSquare.moveToOtherSquare(this, RandomizerForMoveDirection.getResult());
    }

    public WildLife breed() {
        return Breeder.letsBreed(this);
    }


}
