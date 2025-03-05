package ru.sergeeva.geometry;

/**
 * Класс, представляющий линию, заданную двумя точками.
 * Поддерживает инкапсуляцию, проверку на уникальность точек и клонирование.
 */
public class Line implements Cloneable {
    private Point start;
    private Point end;

    // Конструктор
    public Line(Point start, Point end) {
        if (start.equals(end)) {
            throw new RuntimeException("Начало и конец линии не могут быть одной точкой");
        }
        this.start = new Point(start.getX(), start.getY(), start.getZ());
        this.end = new Point(end.getX(), end.getY(), end.getZ());
    }

    // Геттеры и сеттеры
    public Point getStart() { return start; }
    public Point getEnd() { return end; }

    public void setStart(Point start) {
        if (start.equals(this.end)) {
            throw new RuntimeException("Начало и конец линии не могут быть одной точкой");
        }
        this.start = new Point(start.getX(), start.getY(), start.getZ());
    }

    public void setEnd(Point end) {
        if (end.equals(this.start)) {
            throw new RuntimeException("Начало и конец линии не могут быть одной точкой");
        }
        this.end = new Point(end.getX(), end.getY(), end.getZ());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line line = (Line) obj;
        return start.equals(line.start) && end.equals(line.end);
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }

    @Override
    public Line clone() {
        try {
            return (Line) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Клонирование не удалось", e);
        }
    }

    // Метод для проверки, что две линии не имеют общих точек (package-private)
    void checkForSharedPoints(Line otherLine) {
        if (this.start.equals(otherLine.start) || this.start.equals(otherLine.end) ||
                this.end.equals(otherLine.start) || this.end.equals(otherLine.end)) {
            throw new RuntimeException("Ошибка: линии имеют общие точки.");
        }
    }
}