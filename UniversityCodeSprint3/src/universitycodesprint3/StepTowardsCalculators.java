/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitycodesprint3;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class StepTowardsCalculators {
    static int solve(String opr) {
        int x = Character.getNumericValue(opr.charAt(0));
        int y = Character.getNumericValue(opr.charAt(2));
        // Complete this function
        if(opr.charAt(1)=='+') {
            return x+y;
        } else if(opr.charAt(1) == '-') {
            return x-y;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opr = in.next();
        int result = solve(opr);
        System.out.println(result);
        in.close();
    }
}
