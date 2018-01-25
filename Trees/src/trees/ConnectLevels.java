/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import java.util.LinkedList;

/**
 *
 * @author anisha
 */
public class ConnectLevels {

    static class Node {

        int data;
        Node left, right, nextRight;

        Node(int item) {
            data = item;
            left = right = nextRight = null;

        }
    }

    class NodeInfo {

        Node node;
        int level;

        public NodeInfo(Node curr, int level) {
            node = curr;
            this.level = level;

        }
    }

    static void connect(Node root) {
        // Your code here
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            if (curr == null) {
                if (!queue.isEmpty()) {
                    queue.add(null);

                }
                System.err.println("currData: null");

            } else {
                System.err.println("currData:" + curr.data);
                curr.nextRight = queue.peek();
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }

            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(18);
        root.left = new Node(8);
        root.right = new Node(20);
        root.right.left = new Node(10);
        root.right.right = new Node(30);

        connect(root);

    }
}
