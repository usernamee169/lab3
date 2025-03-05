package ru.sergeeva.geometry;

/**
 * Класс, представляющий неизменяемый список целых чисел.
 */
public class ImmutableList {
    private final int[] array;



    // Конструктор с переменным числом аргументов (public)
    public ImmutableList(int... values) {
        this.array = values.clone();
    }

    // Конструктор копирования (public)
    public ImmutableList(ImmutableList other) {
        this.array = other.array.clone();
    }

    // Метод для получения элемента по индексу (public)
    public int get(int index) {
        if (index < 0 || index >= array.length) {
            throw new RuntimeException("Индекс за пределами массива");
        }
        return array[index];
    }

    // Метод для замены элемента (возвращает новый список) (public)
    public ImmutableList set(int index, int value) {
        if (index < 0 || index >= array.length) {
            throw new RuntimeException("Индекс за пределами массива");
        }
        int[] newArray = array.clone();
        newArray[index] = value;
        return new ImmutableList(newArray);
    }

    // Метод для проверки, пуст ли список (public)
    public boolean isEmpty() {
        return array.length == 0;
    }

    // Метод для получения размера списка (public)
    public int size() {
        return array.length;
    }

    // Метод для получения массива значений (public)
    public int[] toArray() {
        return array.clone();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}