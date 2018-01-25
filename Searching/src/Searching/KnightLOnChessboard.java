/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class KnightLOnChessboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // your code goes here
        int[][] moves = new int[n-1][n-1];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (j < i) {
                    moves[i - 1][j - 1] = moves[j - 1][i - 1];
                } else {
                    moves[i - 1][j - 1] = getMoveCount(i, j, n);
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(moves[i-1][j-1] + " ");
            }
            System.out.println();
        }

    }

    private static void addToQueue(LinkedList<Point> queue, int x, int y, 
            int moveCount, boolean[][] visited) {
        if(!visited[x][y]) {
            queue.add(new Point(x,y, moveCount));
            visited[x][y] = true;
        }
    }

    static class Point {

        int x;
        int y;
        int moveCount;

        public Point(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.moveCount = count;
        }

    }

    private static int getMoveCount(int a, int b, int n) {
        boolean[][] visited = new boolean[n][n];
        LinkedList<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0, 0));
        while (!queue.isEmpty()) {
            Point currPoint = queue.remove();
            int x = currPoint.x;
            int y = currPoint.y;
            int moveCount = currPoint.moveCount;

            if (x - a >= 0) {
                if (y - b >= 0) {
                    addToQueue(queue, x-a, y-b, moveCount+1, visited);
                } 
                if (y + b < n) {
                    addToQueue(queue, x-a, y+b, moveCount+1, visited);
                }
            } 
            
            if (x + a < n) {
                if (y - b >= 0) {
                    addToQueue(queue, x+a, y-b, moveCount+1, visited);
                } 
                if (y + b < n) {
                    if(x+a == n-1 && y+b == n-1) {
                        return moveCount+1;
                    }
                    addToQueue(queue, x+a, y+b, moveCount+1, visited);
                }
            }

            if (x - b >= 0) {
                if (y - a >= 0) {
                    addToQueue(queue, x-b, y-a, moveCount+1, visited);
                } 
                if (y + a < n) {
                    addToQueue(queue, x-b, y+a, moveCount+1, visited);
                }
            } 
            if (x + b < n) {
                if (y - a >= 0) {
                    addToQueue(queue, x+b, y-a, moveCount+1, visited);
                } 
                if (y + a < n) {                   
                    if(x+b == n-1 && y+a == n-1) {
                        return moveCount+1;
                    }
                    addToQueue(queue, x+b, y+a, moveCount+1, visited);
                }
            }

        }
        return -1;
    }
}
