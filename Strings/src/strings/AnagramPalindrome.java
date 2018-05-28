/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class AnagramPalindrome {
    static String gameOfThrones(String s){
        // Complete this function
        boolean isPalindrome = false;
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        
        
        return isPalindrome?"YES":"NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
