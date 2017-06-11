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
public class LisasWorkbook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int specialProbblems = 0;
        int currPage = 1;
        for(int i=0;i<n;i++) {
            int probLeft = 1;
            int t = in.nextInt();
            while(probLeft <= t) {
                if((probLeft <= currPage) && (currPage <= Math.min(((probLeft+k-1)), t)) ) {
                    specialProbblems++;
                    System.out.println("CurrPage:"+ currPage);
                }
                currPage++;
                probLeft += k;
            }
        }
        System.out.println(specialProbblems);
        in.close();
    }
}
