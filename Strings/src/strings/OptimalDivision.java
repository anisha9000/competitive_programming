/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 * Leetcode
 * 
 * Given a list of positive integers, the adjacent integers will perform the 
 * float division. For example, [2,3,4] -> 2 / 3 / 4.
 * However, you can add any number of parenthesis at any position to change the 
 * priority of operations. You should find out how to add parenthesis to get 
 * the maximum result, and return the corresponding expression in string format. 
 * Your expression should NOT contain redundant parenthesis.
 * @author anisha
 */
public class OptimalDivision {
    public String optimalDivision(int[] nums) {
        if(nums.length == 1) {
            return ""+nums[0];
        }
        
        if(nums.length == 2) {
            return nums[0] + "/" + nums[1];
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]).append("/(");
        for(int i=1;i<nums.length-1;i++) {
            sb.append(nums[i]).append("/");
        }
        
        sb.append(nums[nums.length-1]).append(")");
        
        return sb.toString();
    }
}
