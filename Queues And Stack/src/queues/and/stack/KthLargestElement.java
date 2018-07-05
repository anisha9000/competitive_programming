/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues.and.stack;

import java.util.PriorityQueue;

/**
 * Leetcode
 * Find the kth largest element in an unsorted array. 
 * Note that it is the kth largest element in the sorted order, not the kth 
 * distinct element.
 * @author anisha
 */
public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> kLargestNums = new PriorityQueue<>(k+1);
        for(int i=0;i<nums.length;i++) {
            kLargestNums.add(nums[i]);
            if(kLargestNums.size() > k) {
                kLargestNums.poll();
            }
        }
        
        return kLargestNums.poll();
    }
}
