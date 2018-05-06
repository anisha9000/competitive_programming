/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Anisha
 */
public class TopView {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Node root = null;
        root = tree.Insert(root, 5);
        root = tree.Insert(root, 3);
        root = tree.Insert(root, 4);
        root = tree.Insert(root, 1);
        root = tree.Insert(root, 2);
        root = tree.Insert(root, 7);
        root = tree.Insert(root, 6);
        root = tree.Insert(root, 9);
        root = tree.Insert(root, 8);
        top_view(root);

    }

    static void top_view(Node root) {
        if(root == null) {
            return;
        }
        Queue<TopViewNode> queue = new LinkedList();
        queue.add(new TopViewNode(root, 0));
        Set<TopViewNode> treeSet = new TreeSet<>();
        
        while(!queue.isEmpty()) {
            TopViewNode pivot = queue.poll();
            int dist = pivot.displacement;
            treeSet.add(pivot);
            if(pivot.n.left != null) {
                queue.add(new TopViewNode(pivot.n.left, (dist-1)));
            }
            if(pivot.n.right != null) {
                queue.add(new TopViewNode(pivot.n.right, (dist+1)));
            }
        }
        
        for(TopViewNode i:treeSet) {
            System.out.print(i.n.data+" ");
        }
        
    }

    static class TopViewNode implements Comparable<TopViewNode>{

        Node n;
        int displacement;

        public TopViewNode(Node node, int d) {
            n = node;
            displacement = d;
        }

        @Override
        public int compareTo(TopViewNode o) {
            return Integer.compare(displacement, o.displacement);
        }

    }
}
