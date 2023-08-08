package org.xsakon.leetcode;

import java.util.HashMap;
import java.util.Map;

public class p1TwoSum {
    //brute force
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];

        for (int i = 0; i < nums.length; i++ ){
            for (int j = i + 1; j < nums.length; j++ ){
                if (nums[i] + nums[j] == target){
                    solution[0] = i;
                    solution[1] = j;
                    return solution;
                }
            }
        }
        return solution;
    }

    // Optimized
    public int[] twoSumV2(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++ ){
            if (numToIndex.containsKey(target - nums[i])){
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }

        return new int[] {};
    }
}
