package trees;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Anisha
 */
public class CheckBST {
    public static void main(String[] args) {
        NodeEvenTree root = new NodeEvenTree(18);
        root.left = new NodeEvenTree(8);
        root.right = new NodeEvenTree(20);
        root.right.left = new NodeEvenTree(10);
        root.right.right = new NodeEvenTree(30);
        
        BinarySearchTree.InOrder(root);
        System.out.println("");
        boolean isBST = checkBST(root);
        System.out.println(isBST?"YES":"NO");
        
    }
    
    private static boolean checkBST(NodeEvenTree root) {
        Set<Integer> map = new HashSet<>();
        return checkBST(root, map);
    }

    private static boolean checkBST(NodeEvenTree root, Set<Integer> map) {
        if(root == null) {
            return true;
        }
        
        if(map.contains(root.data)) {
            return false;
        } else {
            map.add(root.data);
        }
        
        if(root.left == null && root.right == null) {
            return true;
        }
        
        if(root.right == null) {
            return (checkBST(root.left,map));
        } 
        
        if(root.left == null) {
            return (checkBST(root.right,map));
        }
        
        if(root.data > root.left.data && root.data < root.right.data) {
            return (checkBST(root.left,map) && checkBST(root.right, map));
        } else {
            return false;
        }
    }
}


