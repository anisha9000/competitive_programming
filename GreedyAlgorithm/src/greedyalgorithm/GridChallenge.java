/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class GridChallenge {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            int n = in.nextInt();
            char[][] grid = new char[n][n];
            for (int i = 0; i < n; i++) {
                grid[i] = in.next().toCharArray();
                Arrays.sort(grid[i]);
            }

            boolean isSortPossible = sortGrid(grid, n);
            System.out.println(isSortPossible ? "YES" : "NO");

        }

    }

    private static boolean sortGrid(char[][] grid, int n) {
        int i = 0;
        boolean sortPossible = true;
        while (i < n-1) {
            int j = 0;
            while (j < n) {
                if (grid[i][j] > grid[i + 1][j]) {
                    sortPossible = false;
                    break;
                } else {
                    j++;
                }
            }
            if (!sortPossible) {
                break;
            }
            i++;

        }
        return sortPossible;
    }
}
