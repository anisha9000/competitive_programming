/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class OrganizingContainersOfBalls {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int n = in.nextInt();
            int[][] M = new int[n][n];
            long[] sumType = new long[n];
            long[] sumContainer = new long[n];

            for (int M_i = 0; M_i < n; M_i++) {
                for (int M_j = 0; M_j < n; M_j++) {
                    M[M_i][M_j] = in.nextInt();
                    sumType[M_j] += M[M_i][M_j];
                    sumContainer[M_i] += M[M_i][M_j];
                }
            }

            Arrays.sort(sumType);
            Arrays.sort(sumContainer);

            System.out.println(Arrays.equals(sumType, sumContainer) ? "Possible" : "Impossible");
            // your code goes here
        }
    }
}
