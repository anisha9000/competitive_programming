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
        Node root = new Node(18);
        root.left = new Node(8);
        root.right = new Node(20);
        root.right.left = new Node(20);
        root.right.right = new Node(30);
        
        BinarySearchTree.InOrder(root);
        System.out.println("");
        boolean isBST = checkBST(root);
        System.out.println(isBST?"YES":"NO");
        
    }
    
    private static boolean checkBST(Node root) {
        if(root == null || (root.left == null && root.right == null)) {
            return true;
        }
        
        return checkLeftSubTree(root.data, root.left)&&
                checkRightSubTree(root.data, root.right) && checkBST(root.left) &&
                checkBST(root.right);
    }

    private static boolean checkRightSubTree(int data, Node right) {
        if(right == null) {
            return true;
        }
        boolean lt = checkRightSubTree(data, right.left);
        boolean rt = checkRightSubTree(data, right.right);
        return (data<right.data) && lt && rt;
    }
    
    private static boolean checkLeftSubTree(int data, Node left) {
        if(left == null) {
            return true;
        }
        boolean lt = checkLeftSubTree(data, left.left);
        boolean rt = checkLeftSubTree(data, left.right);
        return (data>left.data) && lt && rt;
    }
}
