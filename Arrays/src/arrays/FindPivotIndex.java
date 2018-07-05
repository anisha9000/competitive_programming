/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 * Leetcode
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.

If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index. 
 * @author anisha
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        
        int totalSum = 0;
        for(int num:nums) {
            totalSum+= num;
        }
        
        System.out.println(totalSum);
        
        int sumLeft = 0;
        for(int i=0;i<nums.length;i++) {
            if(totalSum - nums[i] == (sumLeft * 2)) {
                return i;
            }
            sumLeft += nums[i];
            
        }
        
        return -1;
    }
}
