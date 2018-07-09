/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogramming.hackerrank;

/**
 * Leetcode
 * Given an array nums of integers, you can perform operations on the array.

In each operation, you pick any nums[i] and delete it to earn nums[i] points. 
* After, you must delete every element equal to nums[i] - 1 or nums[i] + 1.

You start with 0 points. Return the maximum number of points you can earn by applying such operations
 * @author anisha
 */
public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        if(nums == null || nums.length ==0) {
            return 0;
        }
        
        int[] sum = new int[10001];
        for(int num:nums) {
            sum[num] += num;
        }
     
        int[] points = new int[10001];
        points[1] = sum[1];
        for(int i=2;i<10001;i++) {
            points[i] = Math.max(sum[i]+points[i-2], points[i-1]);
        }
        
        return points[10000];
        
    }
    
}
