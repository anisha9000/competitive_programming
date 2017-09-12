/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci9;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class Q1 {

    private static long countStepsDynamic(int n) {
        if(n < 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        if(stepSum[n] != 0) {
            return stepSum[n];
        }
        return countStepsDynamic(n-1) + countStepsDynamic(n-2) + countStepsDynamic(n-3);
    }
    
    static long stepSum[];
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long stepTotalRecurssion = countStepsRecurssion(n);
        long stepTotalDynamic = countStepsDynamic(n);
        System.out.println("total ways:"+ stepTotalRecurssion);
    }

    private static long countStepsRecurssion(int n) {
        if(n<0) {
            return 0;
        }
        if(n == 0) {
            return 1;
        }
        return countStepsRecurssion(n-1) + countStepsRecurssion(n-2) + countStepsRecurssion(n-3);
    }

    public Q1() {
        this.stepSum = new long[Integer.MAX_VALUE];
    }
}
