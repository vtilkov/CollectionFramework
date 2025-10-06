package com;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse {

    // Перед вами код метода, который переставляет числа в массиве в обратном порядке.
    public static void reverse(int[] intArray) {
        int n = intArray.length - 1;
        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[n - i];
            intArray[n - i] = temp;
        }
    }

    // Задача: написать такой же метод для ArrayList<Integer>.
    public static void reverseArrayList(ArrayList<Integer> intList) {
        int n = intList.size() - 1;
        for (int i = 0; i < intList.size() / 2; i++) {
            int temp = intList.get(i); // сохраним элемент с начала списка
            intList.set(i, intList.get(n - i)); // замена с начала на элемент с конца
            intList.set(n - i, temp); // замена с конца на сохраненный элемент с начала
        }
    }

    // выведем массив printArray
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // выведем массив printArrayList
    public static void printArrayList(ArrayList<Integer> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {

        int[] testArray = {1, 2, 3, 4, 5, 6}; // исходный массив
        System.out.println("Исходный массив: ");
        printArray(testArray); // выведем массив printArray

        reverse(testArray); // метод (из условия) который переставляет числа в массиве в обратном порядке
        System.out.println("Массив после reverse:");
        printArray(testArray); // выведем массив printArray

        // Метод ArrayList<Integer> - reverseArrayList
        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("\nИсходный ArrayList: ");
        printArrayList(testList); // выведем массив printArrayList

        reverseArrayList(testList);
        System.out.println("ArrayList после reverseArrayList: ");
        printArrayList(testList); // выведем массив printArrayList
    }
}