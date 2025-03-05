package ru.sergeeva.geometry;

/**
 * Класс, представляющий одномерную точку с координатой X.
 */
public class Point1D extends AbstractPoint {
    private int x;

    // Конструктор для одномерной точки с цветом и временем
    public Point1D(int x, String color, String creationTime) {
        super(color, creationTime);
        this.x = x;
    }

    // Конструктор для одномерной точки без дополнительных характеристик
    public Point1D(int x) {
        this(x, "не указан", "не указано");
    }

    // Геттеры и сеттеры
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    @Override
    public String toString() {
        return "Одномерная точка: {" + x + "}, " + super.toString();
    }
}