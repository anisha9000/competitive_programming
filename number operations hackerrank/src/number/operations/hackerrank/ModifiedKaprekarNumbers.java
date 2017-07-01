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
public class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        
        findAndDisplayKaprekar(p,q);
    }

    private static void findAndDisplayKaprekar(int p, int q) {
        int kaprekarCount = 0;
        for(int i=p;i<=q;i++) {
            if(isKaprekar(i)) {
                kaprekarCount++;
                System.out.print(i+" ");
            }
        }
        if(kaprekarCount == 0) {
            System.out.println("INVALID RANGE");
        }
    }

    private static boolean isKaprekar(long i) {
        long square = i*i;
        int numOfDigits = String.valueOf(i).length();
        String strSquare = String.valueOf(square);
        int firstHalf = (int) (square / Math.pow(10, numOfDigits));
        int secondHalf = (int) (square % Math.pow(10, numOfDigits));
//        if(firstHalf+secondHalf == i) {
//            System.out.println(firstHalf+","+secondHalf);
//        }
        return firstHalf+secondHalf == i;
        
    }
}
