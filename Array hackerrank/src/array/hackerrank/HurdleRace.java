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
public class HurdleRace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        int tonicCount = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(k<height[height_i]) {
                tonicCount += (height[height_i] - k);
                k = height[height_i];

            }
        }
        System.out.println(tonicCount);
        in.close();
        // your code goes here
    }
}
