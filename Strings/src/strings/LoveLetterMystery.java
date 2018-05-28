/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class LoveLetterMystery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++) {
            String str = in.next();
            int count = 0;
            int length = str.length();
            for(int j=0;j<length/2;j++) {
                if(str.charAt(j) != str.charAt(length-j-1)) {
                    count += Math.abs(str.charAt(j) - str.charAt(length-j-1));
                }
            }
            System.out.println(count);
        }
        in.close();
    }
    
    
}
