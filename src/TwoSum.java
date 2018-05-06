/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> valueMap = new HashMap<>();
        int n=nums.length;

        for(int i=0;i<n;i++) {
            if(valueMap.containsKey(target - nums[i])) {
                result[0] = valueMap.get(target - nums[i]);
                result[1] = i;
                break;
            } else {
                valueMap.put(nums[i], i);

            }

        }
        return result;
    }
}
