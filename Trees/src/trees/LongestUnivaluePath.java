/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 * Leetcode
 * Given a binary tree, find the length of the longest path where each node 
 * in the path has the same value. This path may or may not pass through the root.
 * @author anisha
 */
public class LongestUnivaluePath {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int max;

    public int longestUnivaluePath(TreeNode root) {
        max = 0;
        int currMax = findPath(root, -1);
        return Math.max(max, currMax);
    }

    public int findPath(TreeNode root, int parentVal) {
        if (root == null) {
            return 0;
        }

        if (root.val == parentVal) {
            return 1 + Math.max(findPath(root.left, parentVal), findPath(root.right, parentVal));
        } else {
            int currMax = findPath(root.left, root.val) + findPath(root.right, root.val);
            max = Math.max(max, currMax);
            return 0;
        }
    }
}
