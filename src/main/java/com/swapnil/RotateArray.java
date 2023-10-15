package com.swapnil;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        for (int counter = 1; counter <= k; counter++) {
            rotateOnce(nums);
        }
    }

    private void rotateOnce(int[] nums) {
        int lastOne = nums[nums.length-1];
        int backup = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = backup;
            backup = nums[i];
            nums[i]= temp;
        }
        nums[0] = lastOne;
    }
}
