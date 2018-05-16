/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 * Leetcode We are given the head node root of a binary tree, where additionally
 * every node's value is either a 0 or a 1.
 *
 * Return the same tree where every subtree (of the given tree) not containing a
 * 1 has been removed.
 *
 * (Recall that the subtree of a node X is X, plus every node that is a
 * descendant of X.)
 *
 * @author anisha
 */
public class BinaryTreePruning {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode pruneTree(TreeNode root) {
        if (root.left != null) {
            root.left = pruneTree(root.left);
        }
        if (root.right != null) {
            root.right = pruneTree(root.right);
        }

        // stopping condition; pruning logic
        if (root.left == null && root.right == null && root.val == 0) {
            root = null;
        }

        return root;

    }
}
