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
public class SuperReducedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder(in.next());
        int i = 0;
        while(i<str.length()-1) {
            if(str.charAt(i) == str.charAt(i+1)) {
                str.deleteCharAt(i);
                str.deleteCharAt(i);
                i = 0;
            } else {
                i++;
            }
            
        }
        if(str.length()>0) {
            System.out.println(str);
        
        } else {
            System.out.println("Empty String");
        }
        in.close();
    }
}
