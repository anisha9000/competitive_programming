/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        ArrayList<String> allPermutation = getAllPermutations(word);
        System.out.println(allPermutation);
    }

    private static ArrayList<String> getAllPermutations(String word) {
        ArrayList<String> allPermutations = new ArrayList<>();
        if(word == null) {
            return null;
        }
        if(word.length() == 0) {
            allPermutations.add("");
            return allPermutations;
        } else {
            char first = word.charAt(0);
            ArrayList<String> remainderPermutation = getAllPermutations(word.substring(1));
            allPermutations.addAll(remainderPermutation);
            for(String remainderWord:remainderPermutation) {
                ArrayList<String> newPermutation = appendChar(remainderWord, first);
                allPermutations.addAll(newPermutation);
            }
        }
        return allPermutations;
    }

    private static ArrayList<String> appendChar(String remainderWord, char first) {
        ArrayList<String> appendedList = new ArrayList<>();
        for(int i=0;i<=remainderWord.length();i++) {
            appendedList.add(remainderWord.substring(0, i)+first+remainderWord.substring(i));
        }
        
        return appendedList;
    }
}
