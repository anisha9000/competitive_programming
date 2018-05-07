/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.*;
/**
 *
 * @author anisha
 */
public class JumpingClouds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int count = 0;
        int current = 0;
        do{
            if((current+2 <n) && c[current+2] == 0) {
                current++;
            }
            current++;
            count++;
        } while(current < n-1);
        System.out.println(count);
    }
}
