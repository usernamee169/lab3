package ru.sergeeva.geometry;


/**
 * Класс, представляющий квадрат.
 * Квадрат задается левой верхней точкой и длиной стороны.
 */
public class Square {
    private Point topLeft;
    private int sideLength;

    // Конструктор с точкой
    public Square(Point topLeft, int sideLength) {
        this.topLeft = new Point(topLeft.getX(), topLeft.getY());
        this.sideLength = sideLength;
    }

    // Конструктор с координатами
    public Square(int x, int y, int sideLength) {
        this.topLeft = new Point(x, y);
        this.sideLength = sideLength;
    }

    // Метод для получения ломаной линии, представляющей квадрат
    public Polyline getPolyline() {
        Point p1 = topLeft;
        Point p2 = new Point(topLeft.getX() + sideLength, topLeft.getY());
        Point p3 = new Point(topLeft.getX() + sideLength, topLeft.getY() + sideLength);
        Point p4 = new Point(topLeft.getX(), topLeft.getY() + sideLength);
        return new Polyline(new Point[]{p1, p2, p3, p4});
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + topLeft + " со стороной " + sideLength;
    }
}