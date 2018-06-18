/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * leetcode
 * @author anisha
 */
public class FindDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> dataElements = new HashSet<>();
        List<Integer> repeatedElements = new ArrayList<>();
        int len = nums.length;
        for(int i=0;i<len;i++) {
            if(dataElements.contains(nums[i])) {
                repeatedElements.add(nums[i]);
            } else {
                dataElements.add(nums[i]);
            }
        }
        return repeatedElements;
    }
}
