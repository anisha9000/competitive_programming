/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.hackerrank;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class BeautifulBinaryString {

    static int minSteps(int n, String B){
        // Complete this function
        return n - B.replace("010", "01").length();
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
    
}
