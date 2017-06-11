/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg1;

import java.util.*;

/**
 *
 * @author anisha
 */
public class Q5 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        in.close();

        int length = str.length();
        char[] newStr = new char[length];
        int newStrIndex = 0;
        int charIndex = 0;
        while (charIndex < length) {
            char temp = str.charAt(charIndex);
            int count = 1;
            for (int i = charIndex; i < length - 1; i++) {
                if (str.charAt(i) != str.charAt(i + 1)) {
                    break;
                }
                count++;
            }
            charIndex += count;
            String x = new String(newStr);
            if (length - newStrIndex >= 2) {
                newStr[newStrIndex++] = temp;
                newStr[newStrIndex++] = (char) ('0' + count);
            } else {
                break;
            } 
        }
        if (length == charIndex) {
            System.out.println(newStr);
        } else {
            System.out.println(str);
        }
    }
}
