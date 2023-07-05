package ru.babushkina.week7.addtask.ascendsortarray._main;

import java.util.Arrays;

public class AscendingArray {
    public static void main(String[] args) {
        int[] arr = generateArray();
        String arrayAsString = Arrays.toString(arr);
        int[] sortArray = sortedArray(arr);
        System.out.println(arrayAsString);
        System.out.println(Arrays.toString(sortArray));
    }

    public static int[] generateArray() {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 21) - 10;
        }
        return array;
    }

    public static int[] sortedArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
