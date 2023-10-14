package com.swapnil.leetcode;

import java.util.HashMap;

public class TwoSums {

//    public int[] twoSum(int[] nums, int target) {
//        for()
//    }
//    public int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        HashMap<Integer, Integer> numMap = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            numMap.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
//                return new int[] {i, numMap.get(complement)};
//            }
//        }
//        return result;
//    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) ) {
                return new int[] {i, numMap.get(complement)};
            }
            numMap.put(nums[i], i);
        }
        return result;
    }
}
