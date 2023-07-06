package ru.babushkina.week7.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4, 0, 0, 0, 0, 0};
        int[] result = removeDuplications(nums);

        System.out.println(Arrays.equals(result, expectedNums));
    }

    public static int[] removeDuplications(int[] nums) {
        ArrayList<Integer> tempList = new ArrayList<>();
        for (int num : nums) {
            if (!tempList.contains(num)) {
                tempList.add(num);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < tempList.size()) {
                nums[i] = tempList.get(i);
            } else {
                nums[i] = 0;
            }
        }
        return nums;
    }
}
