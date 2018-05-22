/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Arrays;

/**
 *
 * @author anisha
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxsum = 0;
        int len = nums.length;
        for(int i=0;i<len;i+=2) {
            maxsum+=Math.min(nums[i], nums[i+1]);
        }
        return maxsum;
    }
}
