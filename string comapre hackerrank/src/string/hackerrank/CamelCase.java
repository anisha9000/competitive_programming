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
public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 1;
        int length = s.length();
        for(int i=0;i<length;i++) {
            if(s.charAt(i) > 'A' && s.charAt(i) < 'Z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
