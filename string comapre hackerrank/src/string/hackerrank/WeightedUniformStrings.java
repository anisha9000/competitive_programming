/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.hackerrank;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class WeightedUniformStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        int diff = 96;
        HashSet<Integer> weightSet = new HashSet();
        weightSet.add(s.charAt(0)-diff);
        int numCount = 1;
        for(int i=1;i<s.length();i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                numCount++;
            } else {
                numCount = 1;
            }
            weightSet.add((s.charAt(i)-diff)*numCount);
        }
        System.out.println(weightSet);
        
        for (int a0 = 0; a0 < n; a0++) {
            int x = in.nextInt();
            // your code goes here
            System.out.println(weightSet.contains(x) ? "Yes" : "No");
        }
    }
}
