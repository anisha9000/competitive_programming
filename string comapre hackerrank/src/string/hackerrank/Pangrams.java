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
public class Pangrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.toLowerCase();
        int length = s.length();
        int count = 0;
        boolean arr[] = new boolean[length];
        for(int i=0;i<length;i++) {
            if(s.charAt(i) == ' ') {
                continue;
            }
            if(arr[s.charAt(i)-97] == false) {
                arr[s.charAt(i)-97] = true;
                count++;
            }
        }
        if(count == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
}
