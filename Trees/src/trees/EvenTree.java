package trees;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class EvenTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Node[] nodes = new Node[n+1];
        nodes[1] = new Node();
        for(int i=0;i<m;i++) {
            int child = in.nextInt();
            if(nodes[child] == null) {
                int parent = in.nextInt();
                nodes[child] = new Node();
                nodes[child].updateParent(nodes[parent]);
            }
        }
        
        int edgeDeletionCount = -1;
        for(int i=1;i<=n;i++) {
            if(nodes[i].childCount%2!=0) {
                edgeDeletionCount++;
            }
        }
        
        System.out.println(edgeDeletionCount);
        
        
        
    }
}

class Node {
    Node parent;
    int childCount = 0;
    
    Node() {
        parent = null;
        childCount = 0;
    }
    
    void updateParent(Node parent) {
        this.parent = parent;
        Node ancestor = parent;
        while(ancestor != null) {
            ancestor.childCount++;
            ancestor = ancestor.parent;
        }
    }
}
