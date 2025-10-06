package com;

public class BubbleSort {
    // Перед вами код метода: реализации сортировки «пузырьком».
    public static void bubbleSort(java.util.ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int temp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, temp);
                }
            }
        }
    }

    // Перепишите код, чтобы вместо списка ArrayList<Integer> intList использовался массив int[] intArray.
    public static void bubbleSort(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j]; // омен элементов массива
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
    }

    // Вспомогательный метод для вывода массива
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] testArray = {64, 34, 25, 12, 22, 11, 90}; // массив

        System.out.println("Исходный массив: ");
        printArray(testArray);
        bubbleSort(testArray);

        System.out.println("Отсортированный массив:");
        printArray(testArray);
    }
}
