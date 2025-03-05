package ru.sergeeva.geometry;


/**
 * Абстрактный класс, представляющий точку с возможными характеристиками:
 * координаты, цвет и время появления.
 */
public abstract class AbstractPoint {
    private String color;
    private String creationTime;

    // Конструктор для точек с цветом и временем
    public AbstractPoint(String color, String creationTime) {
        this.color = color;
        this.creationTime = creationTime;
    }

    // Геттеры и сеттеры
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getCreationTime() { return creationTime; }
    public void setCreationTime(String creationTime) { this.creationTime = creationTime; }

    @Override
    public String toString() {
        return "Точка: цвет=" + color + ", время создания=" + creationTime;
    }
}