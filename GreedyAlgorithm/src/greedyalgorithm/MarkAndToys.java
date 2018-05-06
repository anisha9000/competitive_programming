/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class MarkAndToys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int prices[] = new int[n];
        for(int i=0;i<n;i++) {
            prices[i] = in.nextInt();
        }
        Arrays.sort(prices);
        int sum = 0, count = 0;
        for(int i=0;i<n;i++) {
            sum+=prices[i];
            if(sum>k){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
