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
public class CuttingBoards {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int query = 0; query < q; query++) {
            int m = in.nextInt();
            int n = in.nextInt();
            long horizonTalCutCost[] = new long[m - 1];
            long verticalCutCost[] = new long[n - 1];
            for (int i = 0; i < m - 1; i++) {
                horizonTalCutCost[i] = in.nextInt();
            }

            for (int i = 0; i < n - 1; i++) {
                verticalCutCost[i] = in.nextInt();
            }

            int horizontalCutCount = 0;
            int verticalCutCount = 0;
            long totalCost = 0;

            Arrays.sort(horizonTalCutCost);
            Arrays.sort(verticalCutCost);

            int verticalIndex = n - 2;
            int horizontalIndex = m - 2;
            while (verticalIndex >= 0 && horizontalIndex >= 0) {
                if (horizonTalCutCost[horizontalIndex] > verticalCutCost[verticalIndex]) {
                    totalCost += (verticalCutCount + 1) * horizonTalCutCost[horizontalIndex--];
                    horizontalCutCount++;
                } else if (horizonTalCutCost[horizontalIndex] < verticalCutCost[verticalIndex]) {
                    totalCost += (horizontalCutCount + 1) * verticalCutCost[verticalIndex--];
                    verticalCutCount++;
                } else if ((verticalCutCount + 1) * horizonTalCutCost[horizontalIndex] >= (horizontalCutCount + 1) * verticalCutCost[verticalIndex]) {
                    totalCost += (verticalCutCount + 1) * horizonTalCutCost[horizontalIndex--];
                    horizontalCutCount++;
                } else {
                    totalCost += (horizontalCutCount + 1) * verticalCutCost[verticalIndex--];
                    verticalCutCount++;
                }
            }
            while (horizontalIndex >= 0) {
                totalCost += (verticalCutCount + 1) * horizonTalCutCost[horizontalIndex--];
                horizontalCutCount++;
            }
            while (verticalIndex >= 0) {
                totalCost += (horizontalCutCount + 1) * verticalCutCost[verticalIndex--];
                verticalCutCount++;
            }

            System.out.println(totalCost%(int)(Math.pow(10,9)+7));

        }
    }
}
