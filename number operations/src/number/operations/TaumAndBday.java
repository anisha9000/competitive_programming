/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class TaumAndBday {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long cost = 0;
            if (x < y) {
                cost += (b * x);
            } else {
                cost += (w * y);
            }
            if (Math.abs(x - y) < z) {
                if (x < y) {
                    cost += (w * y);
                } else {
                    cost += (b * x);
                }
            } else {
                if (x < y) {
                    cost += (w * (z+x));
                } else {
                    cost += (b * (z+y));
                }
            }
            System.out.println(cost);
        }
    }
}
