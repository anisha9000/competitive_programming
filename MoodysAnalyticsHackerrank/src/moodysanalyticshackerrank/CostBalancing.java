/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodysanalyticshackerrank;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class CostBalancing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int cost[] = new int[m+1];
        int totalSum = 0;
        for(int a0 = 0; a0 < n; a0++){
            int id_number = in.nextInt();
            int amount = in.nextInt();
            cost[id_number] += amount;
            totalSum += amount;
        }
        //System.out.println("totalSum:"+totalSum);
        double finalAvg = (totalSum/m);
        int avgForAll = (int)Math.floor(totalSum/m);
        int avgForAnita = totalSum - (avgForAll*(m-1));
        //System.out.println("avg:"+avgForAll);
        System.out.println(1+" "+(cost[1]-avgForAnita));
        for(int i=2;i<=m;i++) {
            System.out.println(i+" "+(cost[i]-avgForAll));
        }
        in.close();
    }
    
}
