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
public class ZigzagArray {
    static int minimumDeletions(int[] a){
        boolean isDec = a[0]>a[1]?true:false, isInc = !isDec;
        int delecteCount = 0;
        int count = 1;
        for(int i=1;i<a.length-1;i++) {
            if(count == 2) {
                delecteCount++;
                count--;
            }
            if(a[i]<a[i+1]) {
                if(isInc) {
                    count++;
                } else {
                    count = 1;
                }
                isInc = true; isDec = false;
                
            } else if(a[i]>a[i+1]){
                if(isDec) {
                    count++;
                } else {
                    count =1;
                }
                isInc = false; isDec = true;
                
            } 
        }
        return delecteCount;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Return the minimum number of elements to delete to make the array zigzag
        int result = minimumDeletions(a);
        System.out.println(result);
    }
}
