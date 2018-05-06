/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rookierank3;

import java.util.*;

/**
 *
 * @author anisha
 */

class QuickUnion {
    int id[];
    int size[];
    
    public QuickUnion(int n) {
        id = new int[n+1];
        for(int i=1;i<=n;i++) {
            id[i] = i;
        }
        size = new int[n];
        
    }
    
    int root(int a) {
        int root = a;
        while(root != id[root]) {
            root = id[root];
        }
        return root;
    }
    
    public void union(int a, int b) {
        int i = root(a);
        int j = root(b);
        if(i == j) {
            return;
        } else if(size[i] > size[j]) {
            
        }
    }
    
    public void printMax() {
        for(int i=0;i<id.length;i++) {
            System.out.print(id[i]+" ");
        }
        int count = 1;
        
    }
}

class QuickFind {
    int connectedPath[];
    int size;
    
    public QuickFind(int n) {
        connectedPath = new int[n];
        for(int i=0;i<n;i++) {
            connectedPath[i] = i+1;
        }
        size = n;
    }
    
    public void union(int a, int b) {
        int aid = connectedPath[a-1];
        int bid = connectedPath[b-1];
        for(int i=0;i<size;i++) {
            if(connectedPath[i] == aid) {
                connectedPath[i] = bid;
            }
        }
    }
    
    public void printMax() {
        Arrays.sort(connectedPath);
        int count = 1;
        int maxCount = 0;
        
        for(int i=1;i<size;i++) {
            if(connectedPath[i] == connectedPath[i-1]) {
                count++;
            } else {
                if(count > maxCount) {
                    maxCount = count;
                }
                count = 1;
            }
        }
        System.out.println(maxCount);
    }
}
public class MaximalTourism {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        int[][] route = new int[m][2];
        //QuickFind path = new QuickFind(n);
        QuickUnion quickUnion = new QuickUnion(n);
        for (int route_i = 0; route_i < m; route_i++) {
            for (int route_j = 0; route_j < 2; route_j++) {
                route[route_i][route_j] = in.nextInt();
            }
            quickUnion.union(route[route_i][0], route[route_i][1]);
        }
        
        quickUnion.printMax();
        // Write Your Code Here
    }
}
