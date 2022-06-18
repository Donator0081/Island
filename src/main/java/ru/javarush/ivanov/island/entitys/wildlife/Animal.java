package main.java.ru.javarush.ivanov.island.entitys.wildlife;


import main.java.ru.javarush.ivanov.island.entitys.interfaces.WildLife;
import main.java.ru.javarush.ivanov.island.entitys.territory.Square;
import main.java.ru.javarush.ivanov.island.services.breed_services.Breeder;
import main.java.ru.javarush.ivanov.island.services.move_services.ChangeCreaturePositionParams;
import main.java.ru.javarush.ivanov.island.services.randomizers.RandomizerForMoveDirection;

public abstract class Animal implements WildLife {
    Square squareInfo;
    public abstract void eat();

    public void move() {
        ChangeCreaturePositionParams.changePositionsParams(this, RandomizerForMoveDirection.getResult());
    }

    public void breed(){
        Breeder.letsBreed(this);
    }
}
