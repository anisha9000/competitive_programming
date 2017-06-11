/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.hackerrank;

import java.util.*;

/**
 *
 * @author anisha
 */
public class EqualizeArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int maxCount = 0;
        int tempNum = a[0];
        int numCount = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == tempNum) {
                numCount++;
            } else {
                if (numCount > maxCount) {
                    maxCount = numCount;
                }
                numCount = 1;
                tempNum = a[i];
            }
        }
        if (numCount > maxCount) {
            maxCount = numCount;
        }
        System.out.println(n - maxCount);
        in.close();
    }
}
