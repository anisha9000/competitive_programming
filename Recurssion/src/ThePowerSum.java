/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anisha
 */

import java.util.*;

public class ThePowerSum {
    static int powerSum(int X, int N) {
        // Complete this function
        int count = 0;
        HashSet<Integer> powerSet = new HashSet<>();
        //TODO optimmize loop
        int loopIndex = (int) Math.pow(X, 1/N);
        if(X == 1) {
            
        }
        
        for(int i=1;i<X;i++) {
            int currPow = (int) Math.pow(i,N);
            System.out.println("currPow:"+currPow);
            if(powerSet.contains(X-currPow)) {
                count++;
            }
            powerSet.add(currPow);
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int N = in.nextInt();
        int result = powerSum(X, N);
        System.out.println(result);
        in.close();
    }
}
