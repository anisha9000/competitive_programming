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
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        
        char[] strArray = s.toCharArray();
        for(int i=0;i<n;i++) {
            if(strArray[i]>=97 && strArray[i]<=122) {
                strArray[i]+=(k%26);
                if(strArray[i] > 122) {
                    strArray[i] = (char) (96+(strArray[i]-122));
                }
            }
            if(strArray[i]>=65 && strArray[i]<=90) {
                strArray[i]+=(k%26);
                if(strArray[i] > 90) {
                    strArray[i] = (char) (64+(strArray[i]-90));
                }
            }
        }
        System.out.println(strArray);
    }
}
