package ru.babushkina.week7.homework.task2;

import java.util.Stack;

public class CorrectSequence {
    public static void main(String[] args) {
        String[] brackets = {"()", "()[]{}", "(]", "([)]"};
        for (String bracket : brackets) {
            System.out.println(bracket + " is " + isValidSequence(bracket));
        }
    }

    public static boolean isValidSequence(String sequence) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < sequence.length(); i++) {
            char c = sequence.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char bracket = stack.pop();
                if ((c == ')' && bracket != '(') || (c == ']' && bracket != '[') || (c == '}' && bracket != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
