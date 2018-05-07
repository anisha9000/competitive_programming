/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class FairRation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }
        in.close();
        int count = 0;
        for(int i=0;i<N-1;i++) {
            if(B[i]%2 == 1) {
                B[i]++;
                B[i+1]++;
                count+=2;
            }
        }
        if(B[N-1]%2 == 0) {
            System.out.println(count);
        } else {
            System.out.println("NO");
        }
    }
}
