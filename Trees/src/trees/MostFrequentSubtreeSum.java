/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import java.util.*;
/**
 * Leetcode
 * Given the root of a tree, you are asked to find the most frequent subtree sum. 
 * The subtree sum of a node is defined as the sum of all the node values formed 
 * by the subtree rooted at that node (including the node itself). So what is 
 * the most frequent subtree sum value? If there is a tie, return all the values 
 * with the highest frequency in any order.
 * @author anisha
 */
public class MostFrequentSubtreeSum {
    
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root == null) {
            return new int[0];
        }
        int[] maxCount = new int[1];
        HashMap<Integer, Integer> sumCount = new HashMap<>();
        findSubtreeSum(root, sumCount, maxCount);
        
        List<Integer> resultList = new ArrayList<>(sumCount.size());
        for(Map.Entry pair: sumCount.entrySet()) {
            if((Integer)pair.getValue() == maxCount[0]) {
                resultList.add((Integer)pair.getKey());
                
            }
        }
        
        int len = resultList.size();
        int[] result = new int[len];
        for(int i=0; i<len;i++) {
            result[i] = resultList.get(i);
        }
        return result;
        
    }
    
    
    public int findSubtreeSum(TreeNode root, HashMap<Integer, Integer> sumCount, int[] maxCount) {
        if(root == null) {
            return 0;
        }
        
        int sum = root.val + findSubtreeSum(root.left, sumCount, maxCount) + findSubtreeSum(root.right, sumCount, maxCount);
        if(sumCount.containsKey(sum)) {
            sumCount.put(sum, sumCount.get(sum)+1);
        } else {
            sumCount.put(sum, 1);
        }
        if(maxCount[0] < sumCount.get(sum)) {
            maxCount[0] = sumCount.get(sum);
        }
        
        return sum;
        
    }
}
