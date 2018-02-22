/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class ShortestReach2 {

    static class GraphNode implements Comparable<GraphNode> {

        Integer nodeName;
        Long distance;

        public GraphNode(Integer nodeName, Long dist) {
            this.nodeName = nodeName;
            this.distance = dist;
        }

        @Override
        public int compareTo(GraphNode o) {
            return Long.compare(this.distance, o.distance);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            long[] dist = new long[n + 1];
            boolean[] visited = new boolean[n + 1];
            HashMap<Integer, Long> adjList[] = new HashMap[n + 1];
            PriorityQueue<GraphNode> queue = new PriorityQueue<>();

            for (int i = 1; i <= n; i++) {
                dist[i] = Long.MAX_VALUE;
                adjList[i] = new HashMap<>();
            }

            for (int a1 = 0; a1 < m; a1++) {
                int x = in.nextInt();
                int y = in.nextInt();
                int r = in.nextInt();
                if (!adjList[x].containsKey(y) || adjList[x].get(y) > r) {
                    adjList[x].put(y, Long.valueOf(r));
                    adjList[y].put(x, Long.valueOf(r));
                }
            }

            int s = in.nextInt();
            dist[s] = 0;

            queue.add(new GraphNode(s, Long.valueOf(0)));
            while (!queue.isEmpty()) {
                GraphNode currNode = queue.poll();
                int curr = currNode.nodeName;
                visited[curr] = true;
                for (Map.Entry neighbor : adjList[curr].entrySet()) {
                    int neighbourNode = (int) neighbor.getKey();
                    long distance = (long) neighbor.getValue();
                    if (!visited[neighbourNode] && dist[curr] != Long.MAX_VALUE && dist[neighbourNode] > dist[curr] + distance) {
                        dist[neighbourNode] = dist[curr] + distance;
                        queue.add(new GraphNode(neighbourNode, distance));
                    }
                }
                
                //System.out.println("queue status:" + queue.size());
            }

            for (int i = 1; i <= n; i++) {
                if (i != s) {
                    if (dist[i] == Long.MAX_VALUE) {
                        System.out.print("-1 ");
                    } else {
                        System.out.print(dist[i] + " ");
                    }

                }

            }
            System.out.println();
        }
        in.close();
    }
}
