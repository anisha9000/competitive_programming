/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import trees.BinaryTreePruning.TreeNode;

/**
 *
 * @author anisha
 */
public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) {
            return;
        } else if(root.left == null) {
            flatten(root.right);
        } else if(root.right ==null) {
            root.right = root.left;
            root.left = null;
            flatten(root.right);
        } else {
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = null;
            TreeNode rightChild = root.right;
            while(rightChild.right != null) {
                rightChild = rightChild.right;
            }
            rightChild.right = temp;
            flatten(root.right);
            
        }
    }
}
