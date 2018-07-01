/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.HashMap;

/**
 * Leetcode
 * Given a binary array, find the maximum length of a contiguous subarray 
 * with equal number of 0 and 1.
 * @author anisha
 */
public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                nums[i] = -1;
            }
        }
        
        int k = 0;
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        sumIndexMap.put(0,-1);
        
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            if(sumIndexMap.containsKey(sum-k)) {
                maxLen = Math.max(maxLen, i-sumIndexMap.get(sum-k));
            } else if (sum == 0) {
                sumIndexMap.put(sum, i);
                maxLen = Math.max(maxLen, i+1);
            }else {
                sumIndexMap.put(sum, i);
            }
        }
        
        return maxLen;
        
        
    }
}
