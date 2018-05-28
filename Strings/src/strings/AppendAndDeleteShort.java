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
public class AppendAndDeleteShort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int min = Math.min(s.length(),t.length());
        int similarIndex = 0;
        while((similarIndex<s.length() && similarIndex<t.length()) && 
                s.charAt(similarIndex) == t.charAt(similarIndex)) {
            similarIndex++;
        }
        int cost = 0;
        cost = Math.abs(s.length()-similarIndex) + Math.abs(t.length()-similarIndex);
        
        System.out.println(cost== k?"Yes":"No");
        
    }
}
