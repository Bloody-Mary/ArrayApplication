package ru.babushkina.week7.homework.task3;

import java.util.HashMap;
import java.util.Map;

public class CharacterRepetitions {
    public static void main(String[] args) {
        String str = "hello world!";

        Map<Character, Integer> charRepetitionMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charRepetitionMap.containsKey(ch)) {
                charRepetitionMap.put(ch, charRepetitionMap.get(ch) + 1);
            } else {
                charRepetitionMap.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charRepetitionMap.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();

            System.out.println(ch + " - " + count);
        }
    }
}
