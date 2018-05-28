/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.*;
/**
 *
 * @author anisha
 */
public class TimeInWords {

    private static void convertToword(int h, int m) {
        String timeInWord = "";
        if(m == 0) {
            timeInWord = numToStr(h)+" o' clock";
        } else if(m == 15) {
            timeInWord = "quarter past " + numToStr(h);
        } else if(m == 30) {
            timeInWord = "half past " + numToStr(h);
        } else if(m == 45) {
            timeInWord = "quater to " + numToStr(h+1);
        } else if(m < 30) {
            String minute = m==1?"minute":"minutes";
            timeInWord = numToStr(m) +" "+ minute + " past " + numToStr(h);
        } else if(m > 30) {
            String minute = (60-m)==1?"minute":"minutes";
            timeInWord = numToStr(60-m) +" "+ minute + " to " + numToStr(h+1);
        }
        System.out.println(timeInWord);
    }
    
    static String[] tensWord = {"","ten","twenty", "thirty","forty","fifty","sixty"};
    static String[] onesWord = {"one","two","three","four","five","six","seven",
        "eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen",
        "sixteen","seventeen","eighteen","nineteen"};

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        convertToword(h,m);
        in.close();
    }
    
    static String numToStr(int num) {
        int onesPlace = num%10;
        int tensPlace = num/10;
        if(tensPlace == 0) {
            return onesWord[num-1];
        } else if(tensPlace == 1) {
            return onesWord[num-1];
        } else {
            return tensWord[tensPlace] + onesWord[onesPlace-1];
        }
    } 
}
