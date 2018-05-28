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
public class FunnyString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int counter = 0; counter<t; counter++) {
            String s = in.next();
            String r = new StringBuilder(s).reverse().toString();
            boolean isFunny = true;
            for(int i=1;i<s.length();i++) {
                if(Math.abs(s.charAt(i) - s.charAt(i-1)) != 
                        Math.abs(r.charAt(i) - r.charAt(i-1))) {
                    isFunny = false;
                    break;
                }
            }
            if(isFunny) {
                System.out.println("Funny");
            } else {
                System.out.println("Not Funny");
            }
        }
        in.close();
    }
}
