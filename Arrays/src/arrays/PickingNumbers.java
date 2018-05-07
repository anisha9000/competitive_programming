/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.*;

/**
 *
 * @author anisha
 */
public class PickingNumbers {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int maxCount = 1;
        for (int i = 0; i < n; i++) {
            int tempCount = 1;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(a[j] - a[i]) <= 1) {
                    tempCount++;
                } else {

                    break;
                }
            }
            if (tempCount > maxCount) {
                maxCount = tempCount;
            }
        }
        System.out.println(maxCount);
        in.close();
    }
}
