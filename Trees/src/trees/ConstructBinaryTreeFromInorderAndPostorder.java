/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import java.util.*;
/**
 * Leetcode
 * Given inorder and postorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.


 * @author anisha
 */
public class ConstructBinaryTreeFromInorderAndPostorder {
    
    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null || 
           inorder.length != postorder.length || 
           inorder.length == 0 || postorder.length == 0) {
            return null;
        }
        
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        int len = inorder.length;
        for(int i=0;i<len;i++) {
            indexMap.put(inorder[i], i);
        }
        
        return buildTree(inorder, 0, len-1, postorder, 0, len-1, indexMap);
        
    }
    
    public TreeNode buildTree(int[] inorder, int is, int ie, 
                              int[] postorder, int ps, int pe, 
                              HashMap<Integer, Integer> indexMap) {
        if(ie < 0 || is > inorder.length || ie < is || 
           pe < 0 || ps > postorder.length || pe < ps) {
            return null;
        }
        
        if(ie == is) {
            return new TreeNode(inorder[ie]);
        }
        
        TreeNode root = new TreeNode(postorder[pe]);
        int rootIndex = indexMap.get(postorder[pe]);
        
        root.left = buildTree(inorder, is, rootIndex-1, postorder, ps, ps+rootIndex-is-1, indexMap);
        root.right = buildTree(inorder, rootIndex+1, ie, postorder, ps+rootIndex-is, pe-1, indexMap);
        return root;
        
    }
}
