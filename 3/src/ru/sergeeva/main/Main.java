package ru.sergeeva.main;

import ru.sergeeva.geometry.*;
import ru.sergeeva.utils.MathUtils;

import java.util.Scanner;


/**
 * Главный класс программы, демонстрирующий работу всех сущностей.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1.6: Работа с линией
        System.out.println("=== Задание 1.6: Работа с линией ===");

        // Создание первой линии
        System.out.println("Введите координаты начала первой линии (x y):");
        int startX1 = scanner.nextInt();
        int startY1 = scanner.nextInt();
        Point start1 = new Point(startX1, startY1);

        System.out.println("Введите координаты конца первой линии (x y):");
        int endX1 = scanner.nextInt();
        int endY1 = scanner.nextInt();
        Point end1 = new Point(endX1, endY1);

        Line line1 = new Line(start1, end1);
        System.out.println("Создана первая линия: " + line1);

        // Создание второй линии
        System.out.println("Введите координаты начала второй линии (x y):");
        int startX2 = scanner.nextInt();
        int startY2 = scanner.nextInt();
        Point start2 = new Point(startX2, startY2);

        System.out.println("Введите координаты конца второй линии (x y):");
        int endX2 = scanner.nextInt();
        int endY2 = scanner.nextInt();
        Point end2 = new Point(endX2, endY2);

        Line line2 = new Line(start2, end2);
        System.out.println("Создана вторая линия: " + line2);

        // Проверка на совпадение точек между линиями
        try {
            checkLinesForSharedPoints(line1, line2);
            System.out.println("Линии не имеют общих точек.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Задание 1.12: Работа с квадратом
        System.out.println("\n=== Задание 1.12: Работа с квадратом ===");

        // Создание квадрата с заданными параметрами
        Square square1 = new Square(5, 3, 23);
        System.out.println("Создан квадрат 1: " + square1);

        // Получение ломаной линии из квадрата 1
        Polyline polyline = square1.getPolyline();
        System.out.println("Ломаная линия квадрата 2: " + polyline);
        System.out.println("Длина ломаной: " + polyline.getLength());

        // Создание квадрата с вводом данных с клавиатуры
        System.out.println("Введите координаты левого верхнего угла квадрата (x y):");
        int squareX = scanner.nextInt();
        int squareY = scanner.nextInt();
        System.out.println("Введите длину стороны квадрата:");
        int sideLength = scanner.nextInt();

        Square square2 = new Square(squareX, squareY, sideLength);
        System.out.println("Создан квадрат 2: " + square2);

        // Получение ломаной линии из квадрата 2
        polyline = square2.getPolyline();
        System.out.println("Ломаная линия квадрата 2: " + polyline);
        System.out.println("Длина ломаной: " + polyline.getLength());

        // Изменение последней точки ломаной
        System.out.println("Введите новые координаты последней точки ломаной (x y):");
        int newPointX = scanner.nextInt();
        int newPointY = scanner.nextInt();
        polyline.setPoint(3, new Point(newPointX, newPointY));
        System.out.println("Ломаная линия после изменения: " + polyline);
        System.out.println("Новая длина ломаной: " + polyline.getLength());

        // Задание 2.1: Работа с неизменяемым списком
        System.out.println("\n=== Задание 2.1: Работа с неизменяемым списком ===");

        // Создание списка через массив
        int[] array = {1, 2, 3, 4};
        ImmutableList list1 = new ImmutableList(array);
        System.out.println("Список 1 (через массив): " + list1);

        // Создание списка через перечень чисел
        ImmutableList list2 = new ImmutableList(5, 6, 7, 8);
        System.out.println("Список 2 (через перечень чисел): " + list2);

        // Создание списка через копирование другого списка
        ImmutableList list3 = new ImmutableList(list1);
        System.out.println("Список 3 (копия списка 1): " + list3);

        // Получение элемента по индексу
        System.out.println("Введите индекс элемента для получения из списка 1:");
        int index = scanner.nextInt();
        try {
            System.out.println("Элемент на позиции " + index + ": " + list1.get(index));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Замена элемента по индексу
        System.out.println("Введите индекс элемента для замены в списке 2:");
        int replaceIndex = scanner.nextInt();
        System.out.println("Введите новое значение:");
        int newValue = scanner.nextInt();
        try {
            ImmutableList newList = list2.set(replaceIndex, newValue);
            System.out.println("Новый список после замены: " + newList);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Проверка на пустоту
        System.out.println("Список 1 пуст? " + list1.isEmpty());

        // Получение размера списка
        System.out.println("Размер списка 1: " + list1.size());

        // Получение массива значений
        int[] arrayFromList = list1.toArray();
        System.out.print("Массив значений из списка 1: [");
        for (int i = 0; i < arrayFromList.length; i++) {
            System.out.print(arrayFromList[i]);
            if (i < arrayFromList.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");


        // Демонстрация работы с точками (Задание 4.5)
        System.out.println("\n=== Задание 4.5: Работа с точками ===");

        // Одномерная точка
        Point1D point1D = new Point1D(3, "красный", "10:00");
        System.out.println(point1D);

        // Двухмерная точка
        Point2D point2D = new Point2D(7, 7, "желтый", "15:35");
        System.out.println(point2D);

        // Трехмерная точка
        Point3D point3D = new Point3D(4, 2, 5, "синий", "11:00");
        System.out.println(point3D);

        // Точка без дополнительных характеристик
        Point2D point2DDefault = new Point2D(10, 20);
        System.out.println(point2DDefault);



        // Задание 5.1: Сложение чисел
        System.out.println("\n=== Задание 5.1: Сложение чисел ===");
        System.out.println("Сумма 2 + 3/5 + 2.3: " + MathUtils.sum(2, 3.0 / 5, 2.3));
        System.out.println("Сумма 3.6 + 49/12 + 3 + 3/2: " + MathUtils.sum(3.6, 49.0 / 12, 3, 3.0 / 2));
        System.out.println("Сумма 1/3 + 1: " + MathUtils.sum(1.0 / 3, 1));

        // Задание 7.3: Возведение в степень
        System.out.println("\n=== Задание 7.3: Возведение в степень ===");
        if (args.length == 2) {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            System.out.println(x + " в степени " + y + " = " + Math.pow(x, y));
        } else {
            System.out.println("Необходимо передать два аргумента: X и Y");
        }

        // Задание 8.5: Клонирование линии
        System.out.println("\n=== Задание 8.5: Клонирование линии ===");
        Line clonedLine = line1.clone();
        System.out.println("Клонированная линия: " + clonedLine);

        // Проверка, что клонированная линия не равна оригинальной
        System.out.println("Оригинальная линия и клонированная линия равны? " + line1.equals(clonedLine));

        scanner.close();
    }

    /**
     * Метод для проверки, что две линии не имеют общих точек.
     * Если хотя бы одна точка совпадает, выбрасывается исключение.
     */
    private static void checkLinesForSharedPoints(Line line1, Line line2) {
        if (line1.getStart().equals(line2.getStart()) || line1.getStart().equals(line2.getEnd()) ||
                line1.getEnd().equals(line2.getStart()) || line1.getEnd().equals(line2.getEnd())) {
            throw new RuntimeException("Ошибка: линии имеют общие точки.");
        }
    }
}