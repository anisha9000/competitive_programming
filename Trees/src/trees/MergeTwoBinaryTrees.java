/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 * Lettcode
 * You need to merge them into a new binary tree. The merge rule is that if two 
 * nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
 * @author anisha
 */
public class MergeTwoBinaryTrees {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }

        TreeNode mergedRoot;
        if (t1 == null) {
            mergedRoot = new TreeNode(t2.val);
            mergedRoot.left = mergeTrees(null, t2.left);
            mergedRoot.right = mergeTrees(null, t2.right);
        } else if (t2 == null) {
            mergedRoot = new TreeNode(t1.val);
            mergedRoot.left = mergeTrees(t1.left, null);
            mergedRoot.right = mergeTrees(t1.right, null);
        } else {
            mergedRoot = new TreeNode(t1.val + t2.val);
            mergedRoot.left = mergeTrees(t1.left, t2.left);
            mergedRoot.right = mergeTrees(t1.right, t2.right);
        }

        return mergedRoot;

    }
}
