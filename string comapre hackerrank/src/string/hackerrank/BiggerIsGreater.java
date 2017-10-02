/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class BiggerIsGreater {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            String w = in.next();
            String s = findGreaterString(w);
            System.out.println(s.compareTo(w) == 0 ? "no answer" : s);
        }
    }

    private static String findGreaterString(String w) {
        int length = w.length();
        char[] wChar = w.toCharArray();
        int pivot = length - 2;
        while (pivot >= 0) {
            int swapIndex = findNextGreaterChar(wChar, pivot, length);
            if (swapIndex == -1) {
                pivot--;
            } else {
                swapChar(wChar, pivot, swapIndex);
                Arrays.sort(wChar, pivot + 1, length);
                break;
            }

        }

        return new String(wChar);

    }

    private static void swapChar(char[] wChar, int pivot, int swapIndex) {
        char temp = wChar[pivot];
        wChar[pivot] = wChar[swapIndex];
        wChar[swapIndex] = temp;
    }

    private static int findNextGreaterChar(char[] wChar, int pivot, int length) {
        int currIndex = pivot+1;
        int minChar = Character.MAX_VALUE;
        int minIndex = -1;
        while(currIndex < length) {
            if(wChar[currIndex]>wChar[pivot] && minChar>wChar[currIndex]) {
                minChar = wChar[currIndex];
                minIndex = currIndex;
            }
            currIndex++;
        }
        return minIndex;
    }

}
