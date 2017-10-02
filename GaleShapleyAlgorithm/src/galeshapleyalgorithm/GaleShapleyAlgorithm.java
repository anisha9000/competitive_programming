/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galeshapleyalgorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class GaleShapleyAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mPref[][] = new int[n][n];
        int wPref[][] = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                mPref[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                wPref[i][j] = in.nextInt();
            }
        }
        findPairs(n, mPref, wPref);
        
    }

    private static void findPairs(int n, int[][] mPref, int[][] wPref) {
        LinkedList<Integer> freeMenQueue = new LinkedList<>();
        int[] lastPropose = new int[n];
        int[] engaged = new int[n];
        
        Arrays.fill(lastPropose, -1);
        Arrays.fill(engaged, -1);
        
        // Add all men to the queue
        for(int i=0;i<n;i++) {
            freeMenQueue.addLast(i+1);
        }
        while(!freeMenQueue.isEmpty()) {
            int currMan = freeMenQueue.pollFirst()-1;
            int currWoman = mPref[currMan][lastPropose[currMan]+1]-1;
            if(engaged[currWoman] == -1) {
                // Woman is free
                engaged[currWoman] = getIndexOfMan(wPref, n, currWoman, currMan+1);
                
            } else {
                //Woman is engaged
                if(checkWomanPrefChange(wPref, currWoman, currMan+1, engaged[currWoman])) {
                    //Woman prefers new man
                    freeMenQueue.addLast(wPref[currWoman][engaged[currWoman]]);
                    engaged[currWoman] = getIndexOfMan(wPref, n, currWoman, currMan+1);
                    
                } 
            }
            lastPropose[currMan] += 1;
            
        }
        
        //Print pairs
        for(int i=0;i<n;i++) {
            System.out.println((i+1)+","+mPref[i][lastPropose[i]]);
        }
        
    }

    private static int getIndexOfMan(int[][] wPref, int n, int currWoman, int currMan) {
        int index = -1;
        for(int i=0;i<n;i++) {
            if(wPref[currWoman][i] == currMan) {
                index = i;
                break;
            }
        }
        return index;
    }

    private static boolean checkWomanPrefChange(int[][] wPref, int currWoman, int currMan, int oldMan) {
        for(int i=0;i<oldMan;i++) {
            if(wPref[currWoman][i] == currMan) {
                return true;
            }
        }
        return false;
    }
    
}
