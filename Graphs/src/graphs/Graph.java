/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author Anisha
 */
import java.util.*;

class Graph {

    int N;  // no of vertices
    LinkedList<Integer> adjList[];  //array of linkedlists

    Graph(int n) {
        N = n;
        adjList = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int a, int b) {
        adjList[a].add(b);
    }

    void bfs(int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        boolean visited[] = new boolean[N];
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            if (!visited[vertex]) {
                visited[vertex] = true;
                Iterator<Integer> iterator = adjList[vertex].listIterator();
                while(iterator.hasNext()) {
                    int next = iterator.next();
                    if (!visited[next]) {
                        queue.add(next);
                    }
                }
                System.out.print(vertex+" ");
            }
        }

    }
    
    void dfs(int startNode) {
        Stack<Integer> stack = new Stack<>();
        stack.add(startNode);
        boolean visited[] = new boolean[N];
        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            if (!visited[vertex]) {
                visited[vertex] = true;
                Iterator<Integer> iterator = adjList[vertex].listIterator();
                while(iterator.hasNext()) {
                    int next = iterator.next();
                    if (!visited[next]) {
                        stack.push(next);
                    }
                }
                System.out.print(vertex+" ");
            }
        }

    }

    void topologicalSort() {
        int inbound[] = new int[N];
        for(int i=0;i<N;i++) {
            Iterator<Integer> iterator = adjList[i].iterator();
            while(iterator.hasNext()) {
                int next = iterator.next();
                inbound[next]++;
            }
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<N;i++) {
            if(inbound[i] == 0) {
                queue.add(i);
            }
        }
        
        while(!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex+" ");
            Iterator<Integer> vertexIterator = adjList[vertex].iterator();
            while(vertexIterator.hasNext()) {
                int next = vertexIterator.next();
                inbound[next]--;
                if(inbound[next] == 0) {
                    queue.add(next);
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        int n = 6;
        Graph graph = new Graph(n);
//        graph.addEdge(0, 1);
//        graph.addEdge(0, 2);
//        graph.addEdge(0, 3);
//        graph.addEdge(1, 3);
//        graph.addEdge(1, 4);
//        graph.addEdge(2, 5);
//        graph.addEdge(3, 2);
//        graph.addEdge(3, 5);
//        graph.addEdge(3, 6);
//        graph.addEdge(4, 3);
//        graph.addEdge(4, 6);
//        graph.addEdge(6, 5);
        graph.addEdge(5, 2);
        graph.addEdge(5, 0);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        System.out.println("BFS:");
        graph.bfs(2);
        System.out.println("DFS:");
        graph.dfs(2);
        System.out.println("Topological sort:");
        graph.topologicalSort();
    }

}
