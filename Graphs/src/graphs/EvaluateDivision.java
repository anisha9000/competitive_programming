/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.*;
/**
 * Leetcode
 * Equations are given in the format A / B = k, where A and B are variables 
 * represented as strings, and k is a real number (floating point number). 
 * Given some queries, return the answers. If the answer does not exist, return -1.0.
 * @author anisha
 */
public class EvaluateDivision {
    
    class Vertex {
        String name;
        List<Edge> edgeList;
        
        public Vertex (String name) {
            this.name = name;
            edgeList = new LinkedList<>();
        }
        
        public void addEdge(Edge e) {
            edgeList.add(e);
        }
    }
    
    class Edge {
        Vertex v1,v2;
        double weight;
        
        public Edge(Vertex v1, Vertex v2, double weight) {
            this.v1 = v1;
            this.v2 = v2;
            this.weight = weight;
        } 
    }
    
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        // first create the graph
        HashMap<String, Vertex> vertexMap = new HashMap<>();
        int eqLen = equations.length;
        for(int i=0;i<eqLen;i++) {
            Vertex v1,v2;
            if(vertexMap.containsKey(equations[i][0])) {
                v1 = vertexMap.get(equations[i][0]);
            } else {
                v1 = new Vertex(equations[i][0]);
                vertexMap.put(equations[i][0], v1);
            }
            
            if(vertexMap.containsKey(equations[i][1])) {
                v2 = vertexMap.get(equations[i][1]);
            } else {
                v2 = new Vertex(equations[i][1]);
                vertexMap.put(equations[i][1], v2);
            }
            
            Edge forwardEdge = new Edge(v1,v2,values[i]);
            Edge backwardEdge = new Edge(v2,v1,(double)1/values[i]);
            
            v1.addEdge(forwardEdge);
            v2.addEdge(backwardEdge);
        }
        
        int queryLen = queries.length;
        double[] results = new double[queryLen];
        
        for(int i=0;i<queryLen;i++) {
            String variable1 = queries[i][0];
            String variable2 = queries[i][1];
            // if either variable is not present, then it's not possible to calculate the value
            if(!vertexMap.containsKey(variable1) || !vertexMap.containsKey(variable2)) {
                results[i] = -1.0;
                continue;
            }
            
            // see if the vertex 2 is reachable from v1. Calculate result as you move
            results[i] = findPath(vertexMap, variable1, variable2, new HashSet<String>());            
            
        }
        
        return results;
        
    }
    public double findPath(HashMap<String, Vertex> vertexMap, String variable1, String variable2, HashSet<String> visited) {
        if(vertexMap.get(variable1).edgeList.isEmpty() || visited.contains(variable1)) {
            return -1.0;
        }
        
        //System.out.println("1:"+variable1+", 2:"+ variable2);
        visited.add(variable1);
        Vertex v1 = vertexMap.get(variable1);
        
        Iterator i = v1.edgeList.iterator();
        while(i.hasNext()) {
            Edge e = (Edge) i.next();
            if(e.v2.name.equals(variable2)) {
                return e.weight;
            }
            double tempResult = findPath(vertexMap, e.v2.name, variable2, visited);
            if(tempResult != -1.0) {
                return tempResult *= e.weight;
            } 
        }
        
        return -1.0;
    }
    
}
