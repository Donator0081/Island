package ru.javarush.ivanov.island.threads;

import org.jetbrains.annotations.NotNull;
import ru.javarush.ivanov.island.entities.interfaces.WildLife;
import ru.javarush.ivanov.island.entities.territory.Square;
import ru.javarush.ivanov.island.entities.wildlife.Animal;
import ru.javarush.ivanov.island.entities.wildlife.Creature;
import ru.javarush.ivanov.island.entities.wildlife.Herbs;
import ru.javarush.ivanov.island.variables.Constants;
import ru.javarush.ivanov.island.variables.island_params.IslandWidthAndHeight;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;

public class AnimalThread implements Runnable {

    private final String type;

    private final Queue<Task> tasks = new ConcurrentLinkedDeque<>();

    public AnimalThread(String type) {
        this.type = type;
    }

    @Override
    public void run() {
        for (int i = 0; i < IslandWidthAndHeight.getWidth(); i++) {
            for (int j = 0; j < IslandWidthAndHeight.getHeight(); j++) {
                Square square = Constants.ISLAND.getIslandTerritory()[i][j];
                processAtSquare(square);
            }
        }
    }

    private void processAtSquare(@NotNull Square square) {
        Set<Creature> creatures = square.getResidents().get(type);
        if (Objects.nonNull(creatures)) {
            square.getLock().lock();
            try {
                creatures.forEach(c -> {
                    Task task = new Task(c, a -> {
                        a.breed(square);
                        if (c instanceof Animal animal) {
                            animal.eat(square);
                            animal.move(square);
                        }
                    });
                    tasks.add(task);

                });
            } finally {
                square.getLock().unlock();
            }
        }
        tasks.forEach(Task::begin);
        tasks.clear();
    }
}
