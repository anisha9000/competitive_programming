/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.hackerrank;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class CavityMap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for (int grid_i = 0; grid_i < n; grid_i++) {
            grid[grid_i] = in.next();
        }
        String[] result = new String[n];
        result[0] = grid[0];
        result[n - 1] = grid[n - 1];
        for (int i = 1; i < n - 1; i++) {
            result[i] = grid[i];
            for (int j = 1; j < n - 1; j++) {
                if (grid[i].charAt(j) >= grid[i].charAt(j - 1)
                        && grid[i].charAt(j) >= grid[i].charAt(j + 1)
                        && grid[i].charAt(j) >= grid[i - 1].charAt(j)
                        && grid[i].charAt(j) >= grid[i + 1].charAt(j)) {
                    result[i] = result[i].substring(0, i) + 'X' + result[i].substring(i + 1);
                } 
            }
        }
        System.out.println("Output");
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
