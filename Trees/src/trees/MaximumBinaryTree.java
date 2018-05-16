/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 * Leetcode Given an integer array with no duplicates. A maximum tree building
 * on this array is defined as follow:
 *
 * The root is the maximum number in the array. The left subtree is the maximum
 * tree constructed from left part subarray divided by the maximum number. The
 * right subtree is the maximum tree constructed from right part subarray
 * divided by the maximum number.
 *
 * @author anisha
 */
public class MaximumBinaryTree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = createMaxBinaryTree(nums, 0, nums.length - 1);
        return root;
    }

    public TreeNode createMaxBinaryTree(int[] nums, int start, int end) {
        if (start < 0 || end > nums.length || start > end) {
            return null;
        } else if (start == end) {
            // one element left
            return new TreeNode(nums[start]);
        }

        int maxIndex = calculateMaxIndex(nums, start, end);

        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = createMaxBinaryTree(nums, start, maxIndex - 1);
        root.right = createMaxBinaryTree(nums, maxIndex + 1, end);
        return root;
    }

    public int calculateMaxIndex(int[] nums, int start, int end) {
        int maxIndex = start;
        int maxElement = nums[start];
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] > maxElement) {
                maxElement = nums[i];
                maxIndex = i;
            }

        }
        return maxIndex;

    }
}
