/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class ClimbingTheLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        int[] rank = new int[n];
        for (int scores_i = 0; scores_i < n; scores_i++) {
            scores[scores_i] = in.nextInt();
            if (scores_i == 0) {
                rank[scores_i] = 1;
            } else if (scores[scores_i] == scores[scores_i - 1]) {
                rank[scores_i] = rank[scores_i - 1];
            } else {
                rank[scores_i] = rank[scores_i - 1] + 1;
            }
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        int scoreIndex = n - 1;
        for (int alice_i = 0; alice_i < m; alice_i++) {
            alice[alice_i] = in.nextInt();
            boolean rankFound = false;
            for (; scoreIndex >= 0; scoreIndex--) {
                if (scores[scoreIndex] > alice[alice_i]) {
                    System.out.println(rank[scoreIndex] + 1);
                    rankFound = true;
                    break;
                } else if (scores[scoreIndex] == alice[alice_i]) {
                    System.out.println(rank[scoreIndex]);
                    rankFound = true;
                    break;
                }
            }
            if(!rankFound && scores[0]<alice[alice_i]) {
                System.out.println(rank[0]);
            }
        }

        // your code goes here
    }
}
