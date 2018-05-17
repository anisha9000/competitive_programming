package trees;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import trees.NodeEvenTree;
import trees.BinarySearchTree;
import java.util.*;

/**
 *
 * @author Anisha
 */
public class SwapNodes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BinaryTree tree = new BinaryTree();
        NodeEvenTree root = new NodeEvenTree(1);
        LinkedList<NodeEvenTree> queue = new LinkedList<>();
        queue.add(root);
        for (int i = 1; i <= n; i++) {
            queue = tree.insert(i, in.nextInt(), in.nextInt(), queue);
        }
        BinarySearchTree.InOrder(root);
        System.out.println("");
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int k = in.nextInt();
            root = tree.swap(root, k);
            BinarySearchTree.InOrder(root);
            System.out.println("");
        }

        in.close();
    }
}

class BinaryTree {

    LinkedList<NodeEvenTree> insert(int index, int leftChild, int rightChild,
            LinkedList<NodeEvenTree> queue) {

        if (queue.get(0).data == index) {
            NodeEvenTree currNode = queue.poll();
            if (leftChild == -1) {
                currNode.left = null;
            } else {
                currNode.left = new NodeEvenTree(leftChild);
                queue.add(currNode.left);

            }
            if (rightChild == -1) {
                currNode.right = null;
            } else {
                currNode.right = new NodeEvenTree(rightChild);
                queue.add(currNode.right);
            }

        }

        return queue;

    }

    NodeEvenTree swap(NodeEvenTree root, int depth) {
        Queue<NodeEvenTree> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int depthCounter = 1;
        int multipleCounter = 1;
        while (!queue.isEmpty()) {

            while ((depthCounter < multipleCounter * depth)) {
                NodeEvenTree temp = queue.poll();
                if (temp != null) {
                    if (temp.left != null) {
                        queue.add(temp.left);
                    }
                    if (temp.right != null) {
                        queue.add(temp.right);
                    }
                } else {
                    if (queue.isEmpty()) {
                        break;
                    }
                    queue.add(null);
                    depthCounter++;
                }
            }

            if(queue.isEmpty()) {
                break;
            }

            while (queue.peek() != null && depthCounter == (multipleCounter * depth)) {
                //Swap the subtrees
                NodeEvenTree tree = queue.poll();
                NodeEvenTree tempNode = tree.left;
                tree.left = tree.right;
                tree.right = tempNode;
                if (tree.left != null) {
                    queue.add(tree.left);
                }
                if (tree.right != null) {
                    queue.add(tree.right);
                }
            }

            if (depthCounter == multipleCounter * depth) {
                multipleCounter++;
            }
        }

        return root;
    }
}
