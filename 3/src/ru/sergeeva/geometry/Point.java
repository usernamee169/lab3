package ru.sergeeva.geometry;

/**
 * Класс, представляющий точку в двумерном или трехмерном пространстве.
 * Поддерживает координаты X, Y и Z (опционально).
 */
public class Point {
    private int x;
    private int y;
    private int z; // Для трехмерной точки

    // Конструктор для двумерной точки
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0; // По умолчанию Z = 0 для двумерной точки
    }

    // Конструктор для трехмерной точки
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Геттеры и сеттеры
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public int getZ() { return z; }
    public void setZ(int z) { this.z = z; }

    @Override
    public String toString() {
        if (z == 0) {
            return "{" + x + ";" + y + "}";
        } else {
            return "{" + x + ";" + y + ";" + z + "}";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return x == point.x && y == point.y && z == point.z;
    }
}