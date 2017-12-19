/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geeksforgeeks;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class MetaStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            String A = in.next();
            String B = in.next();
            System.out.println(isMeta(A,B));
        }
    }

    private static int isMeta(String A, String B) {
        int misMatchCount = 0;
        if(A.length() != B.length()) {
            return 0;
        }
        int n = A.length();
        for(int i=0;i<n;i++) {
            if(A.charAt(i) != B.charAt(i)) {
                misMatchCount++;
            }
        }
        if(misMatchCount == 2) {
            return 1;
        } else {
            return 0;
        }
    }
}
