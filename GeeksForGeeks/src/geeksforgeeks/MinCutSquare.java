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
public class MinCutSquare {

    public static void main(String[] args) {
        //code
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println(minCut(A,B));
        }
    }

    private static int minCut(int A, int B) {
        int[][] opt = new int[A+1][B+1];
        for(int i=1; i<=A;i++) {
            for(int j=1;j<=B;j++) {
                if(i==j) {
                    opt[i][j] = 1;
                } else {
                    opt[i][j] = Math.min(opt[i-1][j],opt[i][j-1])+1;
                }
            }
        }
        
        for(int i=0;i<=A;i++) {
            for(int j=0;j<=B;j++) {
                System.out.print(opt[i][j]+" ");
            }
            System.out.println();
        }
        
        return opt[A][B];
    }
}
