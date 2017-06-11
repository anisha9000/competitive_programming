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
public class HackerRankInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            String original = "hackerrank";
            int i = 0;
            int j = 0;
            while(i<original.length() && j<s.length()) {
                if(original.charAt(i) == s.charAt(j)) {
                    i++;j++;
                } else {
                    j++;
                }
            }
            if(i == original.length()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
        }
    }
}
