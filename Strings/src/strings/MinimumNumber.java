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
public class MinimumNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String funStr = "int";
        n--;
        while(n-- > 0) {
            funStr = "min(int, "+funStr+")";
        }
        System.out.println(funStr);
    }
}
