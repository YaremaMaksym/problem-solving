package org.xsakon.leetcode;

import java.util.Arrays;

public class p75SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }

    public static void sortColors(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }
}
