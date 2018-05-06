/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations.hackerrank;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class SherlockAndSquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println((int)Math.floor(Math.sqrt(b))- (int)Math.ceil(Math.sqrt(a))+1);
            
        }
    }
}
