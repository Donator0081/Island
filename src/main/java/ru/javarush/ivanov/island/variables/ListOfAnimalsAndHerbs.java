package ru.javarush.ivanov.island.variables;

public enum ListOfAnimalsAndHerbs {
    BEAR("Bear"),
    BOAR("Boar"),
    BUFFALO("Buffalo"),
    CATERPILLAR("Caterpillar"),
    DEER("Deer"),
    DUCK("Duck"),
    FOX("Fox"),
    GOAT("Goat"),
    HAWK("Hawk"),
    HERBS("Herbs"),
    HORSE("Horse"),
    RABBIT("Rabbit"),
    RAT("Rat"),
    SHEEP("Sheep"),
    SNAKE("Snake"),
    WOLF("Wolf");

    final String currency;

    ListOfAnimalsAndHerbs(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }
}
