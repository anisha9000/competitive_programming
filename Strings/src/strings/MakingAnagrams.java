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
public class MakingAnagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        Arrays.sort(aChar);
        Arrays.sort(bChar);
        int i=0,j=0, count = 0;
        while(i<aChar.length && j<bChar.length) {
            if(aChar[i] == bChar[j]) {
                i++;j++;
            } else if(aChar[i] < bChar[j]){
                count++;
                i++;
            } else {
                count++;
                j++;
            }
        }
        if(i != aChar.length) {
            count += (aChar.length - i);
        }
        if(j != bChar.length) {
            count+= (bChar.length - j);
        }
        System.out.println(count);
        in.close();
    }
}
