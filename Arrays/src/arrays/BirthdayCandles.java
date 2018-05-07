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
public class BirthdayCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        Arrays.sort(height);
        int max = height[n-1];
        int count = 0;
        int i = n-1;
        while(i>=0 && height[i] >= max) {
            count++;
            i--;
        }
        System.out.println(count);
    }
}
