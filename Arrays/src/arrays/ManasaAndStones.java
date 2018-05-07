/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author anisha
 */
public class ManasaAndStones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int query = 0; query < t; query++) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            TreeSet<Integer> setOfValues = new TreeSet<Integer>();
            for (int i = 1; i <= n; i++) {
                setOfValues.add(a * (n - i) + b * (i-1));
            }

            for(Integer i:setOfValues) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
