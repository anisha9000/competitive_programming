/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 * Leetcode Given a binary search tree, write a function kthSmallest to find the
 * kth smallest element in it.
 *
 * Note: You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 *
 * @author anisha
 */
public class KthSmallestElementInBST {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class KData {

        int count;
        int val;

    }

    public int kthSmallest(TreeNode root, int k) {
        KData kdata = new KData();
        inorder(root, k, kdata);
        return kdata.val;
    }

    public void inorder(TreeNode root, int k, KData kdata) {
        if (root == null) {
            return;
        }

        inorder(root.left, k, kdata);
        if (++kdata.count == k) {
            kdata.val = root.val;
            return;
        }
        inorder(root.right, k, kdata);
    }
}
