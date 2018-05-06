/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geeksforgeeks;

import java.util.*;
/**
 *
 * @author anisha
 */
public class GenerateBinaryString {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int t = in.nextInt();
        for(int testcase=0;testcase<t;testcase++) {
            String S = in.next();
            //StringBuilder sb = new StringBuilder(S);
            getBinary(S, 0);
        }
    }

    private static void getBinary(String S, int index) {
        //System.out.println("S:"+S);
        if(index >= S.length()) {
            System.out.print(S+" ");
            return;
        }
        if(S.charAt(index) == '?') {
            //System.out.println("index:"+index);
            String newString = S.substring(0, index) + '0' + S.substring(index+1);
            //S.setCharAt(index, '0');
            getBinary(newString, index+1);
            
            newString = S.substring(0, index) + '1' + S.substring(index+1);
            //S.setCharAt(index, '1');
            getBinary(newString, index+1);
        } else {
            getBinary(S, index+1);
        }
    }

    
}
