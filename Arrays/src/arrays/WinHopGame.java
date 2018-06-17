/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 * hackerrank
 * In other words, you can move from index  to index , , or  as long as the 
 * destination index is a cell containing a . If the destination index is 
 * greater than , you win the game.
 * Given  and , complete the function in the editor below so that it returns true 
 * if you can win the game (or false if you cannot).
 * @author anisha
 */
public class WinHopGame {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int n  = game.length;
        int curr = 0;
        boolean[] visited = new boolean[n];
        return canWin(leap, game, n, curr, visited);
    }

    public static boolean canWin(int leap, int[] game, int n, int curr, 
                                 boolean[] visited) {
        if(curr>= (n-1) || curr+leap >= n) {
            //won
            return true;
        }
        boolean winAtCurr = false;
        if(curr > 0 && game[curr-1] == 0 && !visited[curr-1]) {
            visited[curr-1] = true;
            winAtCurr = canWin(leap,game,n,curr-1, visited);
        }
        if(curr < n && game[curr+1] == 0 && !visited[curr+1]) {
            visited[curr+1] = true;
            winAtCurr = winAtCurr || canWin(leap,game,n,curr+1, visited);
        }
        if((curr+leap) < n && game[curr+leap] == 0 && !visited[curr+leap]) {
            visited[curr+leap] = true;
            winAtCurr = winAtCurr || canWin(leap,game,n,curr+leap, visited);
        }
        return winAtCurr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
