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
        NodeBST[] nodes = new NodeBST[n+1];
        nodes[1] = new NodeBST();
        for(int i=0;i<m;i++) {
            int child = in.nextInt();
            if(nodes[child] == null) {
                int parent = in.nextInt();
                nodes[child] = new NodeBST();
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

class NodeBST {
    NodeBST parent;
    int childCount = 0;
    
    NodeBST() {
        parent = null;
        childCount = 0;
    }
    
    void updateParent(NodeBST parent) {
        this.parent = parent;
        NodeBST ancestor = parent;
        while(ancestor != null) {
            ancestor.childCount++;
            ancestor = ancestor.parent;
        }
    }
}
