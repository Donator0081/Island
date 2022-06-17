package main.java.ru.javarush.ivanov.island.variables.island_params;

public class IslandWidthAndHeight {
    private static int width;
    private static int height;

    private IslandWidthAndHeight() {
    }

    public static int getWidth() {
        return width;
    }

    public static void setWidth(int width) {
        IslandWidthAndHeight.width = width;
    }

    public static int getHeight() {
        return height;
    }

    public static void setHeight(int height) {
        IslandWidthAndHeight.height = height;
    }
}
