/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues.and.stack;

import java.util.*;

/**
 *
 * @author anisha
 */
public class EqualStacks {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        int totalh1 = 0, totalh2 = 0, totalh3 = 0;
        for (int h1_i = n1 - 1; h1_i >= 0; h1_i--) {
            h1[h1_i] = in.nextInt();
            totalh1 += h1[h1_i];
        }
        int h2[] = new int[n2];
        for (int h2_i = n2 - 1; h2_i >= 0; h2_i--) {
            h2[h2_i] = in.nextInt();
            totalh2 += h2[h2_i];
        }
        int h3[] = new int[n3];
        for (int h3_i = n3 - 1; h3_i >= 0; h3_i--) {
            h3[h3_i] = in.nextInt();
            totalh3 += h3[h3_i];
        }
        int maxStack = getMaxStack(totalh1, totalh2, totalh3);

        while (maxStack > 0 && n1 > 0 && n2 > 0 && n3 > 0) {
            switch (maxStack) {
                case 1:
                    n1 -= 1;
                    totalh1 -= h1[n1];
                    break;
                case 2:
                    n2 -= 1;
                    totalh2 -= h2[n2];
                    break;
                case 3:
                    n3 -= 1;
                    totalh3 -= h3[n3];
                    break;
            }
            maxStack = getMaxStack(totalh1, totalh2, totalh3);
        }
        if (n1 == 0 || n2 == 0 || n3 == 0) {
            System.out.println("0");
        } else {
            System.out.println(totalh1);
        }
        
    }

    private static int getMaxStack(int totalh1, int totalh2, int totalh3) {

        if (totalh1 == totalh2 && totalh1 == totalh3) {
            return 0;
        } else if (totalh1 > totalh2) {
            if (totalh1 > totalh3) {
                return 1;
            } else {
                return 3;
            }
        } else if (totalh2 > totalh3) {
            return 2;
        } else {
            return 3;
        }
    }
}
