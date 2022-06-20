package main.java.ru.javarush.ivanov.island.entities.wildlife;


import main.java.ru.javarush.ivanov.island.entities.interfaces.WildLife;
import main.java.ru.javarush.ivanov.island.entities.territory.Square;
import main.java.ru.javarush.ivanov.island.services.breed_services.Breeder;
import main.java.ru.javarush.ivanov.island.services.eat_services.Eater;
import main.java.ru.javarush.ivanov.island.services.move_services.MoveToOtherSquare;
import main.java.ru.javarush.ivanov.island.services.randomizers.RandomizerForMoveDirection;
import main.java.ru.javarush.ivanov.island.variables.Constants;
import main.java.ru.javarush.ivanov.island.variables.animal_params.AnimalParams;

public abstract class Animal implements WildLife {
    Square squareInfo;
    AnimalParams animalParams;

    public void eat() {
        if (Eater.letsEat(this)) {
            animalParams.setTurnsToDeath(2);
        } else {
            animalParams.setTurnsToDeath(animalParams.getTurnsToDeath() - 1);
            if (animalParams.getTurnsToDeath() < 0) {
                Constants.ISLAND.getIslandTerritory()[this.getSquareInfo().getSquareNumberWidth()]
                        [this.getSquareInfo().getSquareNumberHeight()].getWildLifeAtSquare().remove(this);
                this.setSquareInfo(null);
            }
        }

    }

    public void move() {
        MoveToOtherSquare.moveToOtherSquare(this, RandomizerForMoveDirection.getResult());
    }

    public void breed() {
        Breeder.letsBreed(this);
    }
}
