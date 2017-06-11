/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.hackerrank;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int length = S.length();
        int count = 0;
        int oIndex = 1;
        for (int i = 0; i < length; i++) {
            if (i == oIndex) {
                if (S.charAt(i) != 'O') {
                    count++;
                }
                oIndex += 3;
            } else if (i != oIndex && S.charAt(i) != 'S') {
                count++;
            }

        }
        System.out.println(count);
    }
}
