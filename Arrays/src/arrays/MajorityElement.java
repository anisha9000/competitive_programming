/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author anisha
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majorityIndex = 0;
        int count = 1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] == nums[majorityIndex]) {
                count++;
            } else {
                count--;
            }
            if(count == 0) {
                majorityIndex = i;
                count = 1;
            }
        }
        
        
        int majorityReq = nums.length/2;
        int countMajority = 0;
        // verify
        for(int i=0;i<nums.length;i++) {
            if (nums[i] == nums[majorityIndex]) {
                countMajority++;
            } 
        }
        
        if(countMajority >= majorityReq) {
            return nums[majorityIndex];
        }
        
        return -1;        
        
    }
}
