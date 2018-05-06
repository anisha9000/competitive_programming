/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcodesprint10;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class RewardPoints {

    static int getPoints(int month1, int month2, int month3){
        // Complete this function
        int total = 0;
        if(month1 > 10) {
            total+=100;
        } else {
            total += (month1*10);
        }
        if(month2 > 10) {
            total+=100;
        } else {
            total += (month2*10);
        }
        if(month3 > 10) {
            total+=100;
        } else {
            total += (month3*10);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month1 = in.nextInt();
        int month2 = in.nextInt();
        int month3 = in.nextInt();
        int pointsEarned = getPoints(month1, month2, month3);
        System.out.println(pointsEarned);
    }
    
}
