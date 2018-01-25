/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class ShortestReach {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] dist = new int[n + 1];
            boolean[] visited = new boolean[n + 1];
            LinkedList<Integer>[] adjList = new LinkedList[n + 1];
            LinkedList<Integer> queue = new LinkedList<>();

            for (int i = 0; i <= n; i++) {
                dist[i] = -1;
                adjList[i] = new LinkedList<>();
            }

            for (int a1 = 0; a1 < m; a1++) {
                int u = in.nextInt();
                int v = in.nextInt();
                adjList[u].add(v);
                adjList[v].add(u);

            }

            int s = in.nextInt();
            dist[s] = 0;

            queue.add(s);
            while (!queue.isEmpty()) {
                int curr = queue.poll();
                visited[curr] = true;
                Iterator i = adjList[curr].iterator();
                while (i.hasNext()) {
                    int neighbor = (Integer) i.next();
                    //System.out.println("curr:" + curr + ", neighbour:" + neighbor);
                    if (!visited[neighbor]) {
                        //System.out.println("new neighbour:" + neighbor);
                        dist[neighbor] = dist[curr] + 6;
                        visited[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
                System.out.println("queue status:" + queue.size());

            }

            for (int i = 1; i <= n; i++) {
                if (i != s) {
                    System.out.print(dist[i] + " ");
                }

            }
            System.out.println();
        }
        in.close();
    }
}
