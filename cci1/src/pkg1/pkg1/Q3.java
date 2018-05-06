/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg1;

import java.util.*;

/**
 *
 * @author anisha
 */
public class Q3 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(isPermutation(str1, str2));
        System.out.println(numberOfChar(str1, str2));
        in.close();
    }

    private static boolean isPermutation(String str1, String str2) {
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    /* No. of characters needed to make them anagrams*/
    private static int numberOfChar(String first, String second) {
        int numberNeeded = 0;
        if (!isPermutation(first, second)) {
            char[] firstArray = first.toCharArray();
            char[] secondArray = second.toCharArray();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            int maxLength = (first.length()> second.length())?first.length():second.length(); 
            int firstIndex = 0, secondIndex = 0;
            while(firstIndex<first.length() && secondIndex<second.length()) {
                if(firstArray[firstIndex] < secondArray[secondIndex]) {
                    numberNeeded++;
                    firstIndex++;
                } else if(firstArray[firstIndex] > secondArray[secondIndex]) {
                    numberNeeded++;
                    secondIndex++;
                } else {
                    firstIndex++;
                    secondIndex++;
                }
            }
            if(firstIndex != first.length()) {
                numberNeeded += (first.length() - firstIndex);
            }
            if(secondIndex != second.length()) {
                numberNeeded += (second.length() - secondIndex);
            }
            
            
            
            
        }

        return numberNeeded;
    }
}
