package ru.babushkina.week7.add_task.arrayapp._main;

import java.util.Arrays;

public class ArrayApplication {
    public static void main(String[] args) {
        int[] arr = generateArray();

        String arrayAsString = Arrays.toString(arr);
        int evenNumbersCount = countEvenNumbs(arr);
        int oddNumbersCount = countOddNumbs(arr);
        int primeNumbersSum = sumPrimeNumbs(arr);
        int summedArray = sumArray(arr);
        int diffIndexNumbers = indexNumbsDiff(arr);
        int summedIndexZero = sumIndexZero(arr);

        System.out.println(arrayAsString);
        System.out.println(evenNumbersCount);
        System.out.println(oddNumbersCount);
        System.out.println(primeNumbersSum);
        System.out.println(summedArray);
        System.out.println(diffIndexNumbers);
        System.out.println(summedIndexZero);
    }

    public static int[] generateArray() {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 21) - 10;
        }
        return arr;
    }

    public static int countEvenNumbs(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public static int countOddNumbs(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result++;
            }
        }
        return result;
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
   }

   public static int sumPrimeNumbs(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
           if (isPrimeNumber(arr[i])) {
               result++;
           }
       }
       return result;
   }

    public static int sumArray(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    public static int indexNumbsDiff(int[] arr) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        return evenSum - oddSum;
    }

    public static int sumIndexZero(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                result++;
            }
        }
        return result;
    }
}
