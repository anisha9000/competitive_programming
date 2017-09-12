/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgorithm;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class SherlockAndTheBeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int x = (n / 3) * 3;    // x denotes the number of 5's
            while (x > 0) {
                if ((n - x) % 5 == 0) {
                    //3's in multiple of 5's
                    break;
                } else {
                    x -= 3;
                }
            }
            StringBuilder num = new StringBuilder();
            num.inser
            if (x > 0) {
                num = num.append('5');
                for (int j = 0; j < x - 1; j++) {
                    num = num.append(5);
                }
                for (int j = 0; j < (n - x); j++) {
                    num = num.append(3);
                }
            } else if (n % 5 == 0) {
                //fill with 3's
                num = num.append(3);
                for (int j = 0; j < n-1; j++) {
                    num = num.append(3);
                }
            } else {
                num = num.append(-1);
            }
            System.out.println(num);
        }
    }
}
