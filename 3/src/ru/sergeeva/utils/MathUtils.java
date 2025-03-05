package ru.sergeeva.utils;


/**
 * Утилитный класс для математических операций.
 */
public class MathUtils {
    // Метод для вычисления суммы чисел
    public static double sum(double... values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum;
    }
}