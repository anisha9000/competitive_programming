/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.*;

/**
 * leetcode
 * Given a directed, acyclic graph of N nodes.  
 * Find all possible paths from node 0 to node N-1, and return them in any order.
 * The graph is given as follows:  the nodes are 0, 1, ..., graph.length - 1.  
 * graph[i] is a list of all nodes j for which the edge (i, j) exists
 * @author anisha
 */
public class AllPathsFromSourcetoTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> currPath = new ArrayList<>();
        currPath.add(0);
        findPaths(graph, 0, allPaths, currPath);
        return allPaths;        
    }
    
    public void findPaths(int[][] graph, int startNode, List<List<Integer>> allPaths, List<Integer> currPath) {
        if(startNode == (graph.length-1)) {
            allPaths.add(new ArrayList<Integer>(currPath));
        }
        
        //isReachable from all entries in the list
        int attachedNodeCount = graph[startNode].length;
        for(int i=0;i<attachedNodeCount;i++) {
            currPath.add(graph[startNode][i]);
            findPaths(graph, graph[startNode][i], allPaths, currPath);
            currPath.remove(currPath.size()-1);
        }        
    }
}
