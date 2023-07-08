package ru.babushkina.week7.homework.task4;

import java.util.LinkedList;

public class DeleteEvenNumbs {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(12);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(7);
        list.add(13);
        list.add(6);
        list.add(18);
        list.add(25);
        list.add(14);

        System.out.println("Изначальный список: " + list);
        deleteEvenNumbs(list);

        System.out.println("Список после удаления чётных чисел: " + list);
    }

    public static void deleteEvenNumbs(LinkedList<Integer> intList) {
        LinkedList<Integer> oddNumbs = new LinkedList<>();
        for (int num : intList) {
            if (num % 2 != 0) {
                oddNumbs.add(num);
            }
        }
        intList.clear();
        intList.addAll(oddNumbs);
    }
}
