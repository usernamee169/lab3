package ru.sergeeva.geometry;


/**
 * Класс, представляющий трехмерную точку с координатами X, Y и Z.
 */
public class Point3D extends AbstractPoint {
    private int x;
    private int y;
    private int z;

    // Конструктор для трехмерной точки с цветом и временем
    public Point3D(int x, int y, int z, String color, String creationTime) {
        super(color, creationTime);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Конструктор для трехмерной точки без дополнительных характеристик
    public Point3D(int x, int y, int z) {
        this(x, y, z, "не указан", "не указано");
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
        return "Трехмерная точка: {" + x + ";" + y + ";" + z + "}, " + super.toString();
    }
}