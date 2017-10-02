/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class Gemstones {

    static int gemstones(String[] arr) {
        // Complete this function
        HashSet<Character> gemSet = new HashSet<Character>();
        for (char c : arr[0].toCharArray()) {
            gemSet.add(c);
        }
        for (int i = 1; i < arr.length; i++) {
            HashSet<Character> newSet = new HashSet<Character>();
            for (char c : arr[i].toCharArray()) {
                newSet.add(c);
            }
            gemSet.retainAll(newSet);
        }

        return gemSet.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
