/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class MaximumPerimeterTriangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] lengths = new Integer[n];
        Integer[] triangle = new Integer[3];
        for (int i = 0; i < n; i++) {
            lengths[i] = in.nextInt();
        }
        Arrays.sort(lengths, Comparator.reverseOrder());
        boolean triangeFound = false;
        for (int i = 0; i < n - 2; i++) {
            triangeFound = checkTriangeProperties(lengths[i], lengths[i+1], lengths[i+2]);
            if (triangeFound) {
                System.out.println(lengths[i+2] + " " + lengths[i+1] + " " + lengths[i]);
                break;
            }
        }
        if (!triangeFound) {
            System.out.println("-1");
        }
    }

    private static boolean checkTriangeProperties(Integer a, Integer b, Integer c) {
        return (b + c > a);
    }
}
