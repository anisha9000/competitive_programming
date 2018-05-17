package trees;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

/**
 *
 * @author Anisha
 */
public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();
        NodeEvenTree root = tree.Insert(null, 4);
        tree.Insert(root, 2);
        tree.Insert(root, 1);
        tree.Insert(root, 3);
        tree.Insert(root, 6);
        tree.Insert(root, 4);
        tree.LevelOrder(root);
        in.close();

    }

    public static void LevelOrder(NodeEvenTree root)
    {
       if(root ==null) {
           return;
       }
      LinkedList<NodeEvenTree> queue = new LinkedList<>();
       queue.add(root);
       while(!queue.isEmpty()) {
           NodeEvenTree item = queue.pollFirst();
           System.out.print(item.data+" ");
           if(item.left!=null)
           queue.add(item.left);
           if(item.right!=null)
           queue.add(item.right);
       }
      
    }
    
    public static void InOrder(NodeEvenTree root) {
        if(root == null) {
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }

    public NodeEvenTree Insert(NodeEvenTree root, int value) {
        if (root == null) {
            root = new NodeEvenTree(value);
            return root;
        }

        if (root.data > value) {
            //insert in left sub tree
            root.left = Insert(root.left, value);
        } else if (root.data < value) {
            //insert in right sub tree
            root.right = Insert(root.right, value);
        }
        
        return root;
        
    }

}

class NodeEvenTree {

    int data;
    NodeEvenTree left;
    NodeEvenTree right;
    
    NodeEvenTree(int value) {
        data = value;
        left = null;
        right = null;
    }
}
