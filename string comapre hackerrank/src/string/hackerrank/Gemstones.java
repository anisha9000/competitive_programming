/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class Gemstones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int charCount[] = new int[26];
        for(int i=0;i<n;i++) {
            String s = in.next();
            s = s.toLowerCase();
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            charCount[sArray[0]-97]++;
            for(int j=1;j<sArray.length;j++) {
                if(sArray[j] != sArray[j-1]) {
                    charCount[sArray[j]-97]++;
                }
            }
        }
        int gemCount = 0;
        for(int i=0;i<n;i++) {
            if(charCount[i] == n) {
                gemCount++;
            }
        } 
        System.out.println(gemCount);
        in.close();
    }
}
