/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.*;
/**
 * Leetcode
 * Given an undirected graph, return true if and only if it is bipartite.

Recall that a graph is bipartite if we can split it's set of nodes into two 
* independent subsets A and B such that every edge in the graph has one node in 
* A and another node in B.
 * @author anisha
 */
public class IsGraphBipartite {
    public boolean isBipartite(int[][] graph) {
        int[] vertexColor = new int[graph.length];
        Arrays.fill(vertexColor, -1);
        boolean isBipartite = true;
        
        for(int i=0;i< graph.length;i++) {
            // If not visited this node yet
            if(vertexColor[i] == -1) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                vertexColor[i] = 1;
                
                while(!queue.isEmpty()) {
                    int currNode = queue.poll();
                    for(int j=0 ; j<graph[currNode].length;j++) {
                        
                        if(vertexColor[graph[currNode][j]] == -1) {
                            vertexColor[graph[currNode][j]] = (vertexColor[currNode] == 1) ? 2 : 1;
                            queue.add(graph[currNode][j]);
                        } else if(vertexColor[graph[currNode][j]] == vertexColor[currNode]) {
                            isBipartite = false;
                            break;
                        }
                        
                    }
                }                
            }
        }
        
        return isBipartite;
        
        
        
    }
    
}
