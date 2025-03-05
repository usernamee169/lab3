package ru.sergeeva.geometry;

/**
 * Абстрактный класс для фигур.
 */
public abstract class Shape {
    private String color;
    private String creationTime;

    public Shape(String color, String creationTime) {
        this.color = color;
        this.creationTime = creationTime;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getCreationTime() { return creationTime; }
    public void setCreationTime(String creationTime) { this.creationTime = creationTime; }

    @Override
    public String toString() {
        return "Фигура: цвет=" + color + ", время создания=" + creationTime;
    }
}