/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.hackerrank;
import java.util.*;
/**
 *
 * @author anisha
 */
public class JumpingOnClouds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int E = 100;
        int currIndex = 0;
        do{
            currIndex = (currIndex + k) % n;
            if(c[currIndex] == 1) {
                E = E-2;
            }
            E--;
        } while(currIndex != 0);
        System.out.println(E);
    }
}
