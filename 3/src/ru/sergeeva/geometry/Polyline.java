package ru.sergeeva.geometry;


/**
 * Класс, представляющий ломаную линию, заданную массивом точек.
 */
public class Polyline {
    private Point[] points;

    // Конструктор
    public Polyline(Point[] points) {
        this.points = points.clone();
    }

    // Метод для вычисления длины ломаной
    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.length - 1; i++) {
            length += Math.sqrt(Math.pow(points[i+1].getX() - points[i].getX(), 2) +
                    Math.pow(points[i+1].getY() - points[i].getY(), 2));
        }
        return length;
    }

    // Метод для изменения точки в ломаной
    public void setPoint(int index, Point point) {
        if (index < 0 || index >= points.length) {
            throw new RuntimeException("Индекс за пределами массива");
        }
        points[index] = point;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Ломаная линия: ");
        for (Point p : points) {
            sb.append(p).append(" ");
        }
        return sb.toString();
    }
}