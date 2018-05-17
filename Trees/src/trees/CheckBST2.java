package trees;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Anisha
 */
public class CheckBST2 {
    public static void main(String[] args) {
        NodeEvenTree root = new NodeEvenTree(18);
        root.left = new NodeEvenTree(8);
        root.right = new NodeEvenTree(20);
        root.right.left = new NodeEvenTree(20);
        root.right.right = new NodeEvenTree(30);
        
        BinarySearchTree.InOrder(root);
        System.out.println("");
        boolean isBST = checkBST(root);
        System.out.println(isBST?"YES":"NO");
        
    }
    
    private static boolean checkBST(NodeEvenTree root) {
        if(root == null || (root.left == null && root.right == null)) {
            return true;
        }
        
        return checkLeftSubTree(root.data, root.left)&&
                checkRightSubTree(root.data, root.right) && checkBST(root.left) &&
                checkBST(root.right);
    }

    private static boolean checkRightSubTree(int data, NodeEvenTree right) {
        if(right == null) {
            return true;
        }
        boolean lt = checkRightSubTree(data, right.left);
        boolean rt = checkRightSubTree(data, right.right);
        return (data<right.data) && lt && rt;
    }
    
    private static boolean checkLeftSubTree(int data, NodeEvenTree left) {
        if(left == null) {
            return true;
        }
        boolean lt = checkLeftSubTree(data, left.left);
        boolean rt = checkLeftSubTree(data, left.right);
        return (data>left.data) && lt && rt;
    }
}
