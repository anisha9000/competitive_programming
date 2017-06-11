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
public class Q4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char arr[] = new char[100];
        for(int i=0;i<str.length();i++) {
            arr[i] = str.charAt(i);
        }
        String finalStr = new String(removeWhiteSpace(arr, str.length()));
        
        System.out.println(finalStr);
        in.close();
    }

    // Better solution: first count all the spaces. Now walk backwards and store each char starting the end
    private static char[] removeWhiteSpace(char[] arr, int length) {
        
        for(int i =0;i<length;i++) {
            if(arr[i] == ' ') {
                int j=length-1;
                while(j != i) {
                    arr[j+2] = arr[j];
                    j--;
                }   
                arr[i++] = '%';
                arr[i++] = '2';
                arr[i] = '0';
                length += 2;
            }
        }
        return arr;
    }
}
