package ru.sergeeva.geometry;


/**
 * Класс, представляющий двухмерную точку с координатами X и Y.
 */
public class Point2D extends AbstractPoint {
    private int x;
    private int y;

    // Конструктор для двухмерной точки с цветом и временем
    public Point2D(int x, int y, String color, String creationTime) {
        super(color, creationTime);
        this.x = x;
        this.y = y;
    }

    // Конструктор для двухмерной точки без дополнительных характеристик
    public Point2D(int x, int y) {
        this(x, y, "не указан", "не указано");
    }

    // Геттеры и сеттеры
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    @Override
    public String toString() {
        return "Двухмерная точка: {" + x + ";" + y + "}, " + super.toString();
    }
}