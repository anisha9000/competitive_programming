/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgorithm;

import java.util.*;

/**
 *
 * @author anisha
 */
public class ChiefHopper {
    static int chiefHopper(int[] arr) {
        // Complete this function
        int requiredEnergy =0;
        int totalBuilding = arr.length;
        for(int i=totalBuilding-1;i>=0;i--) {
            requiredEnergy = (int) Math.ceil((requiredEnergy + arr[i]+1)/2);
            //System.out.println("required Enegry:"+requiredEnergy);
        }
        
        
        return requiredEnergy;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = chiefHopper(arr);
        System.out.println(result);
        in.close();
    }
}
