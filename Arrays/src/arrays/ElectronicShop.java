/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.*;
/**
 *
 * @author anisha
 */
public class ElectronicShop {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int keyboard[] = new int[n];
        int usb[] = new int[m];
        for(int i=0;i<n;i++) {
            keyboard[i] = in.nextInt();
        }
        for(int i=0;i<m;i++) {
            usb[i] = in.nextInt();
        }
        Arrays.sort(keyboard);
        Arrays.sort(usb);
        int sum = -1;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if((keyboard[i]+usb[j]) <=s && (keyboard[i]+usb[j] > sum)) {
                    sum = keyboard[i]+usb[j];
                }
            }
        }
        
        System.out.println(sum);
        in.close();
    }
}
