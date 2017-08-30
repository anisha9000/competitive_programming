/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class FlatlandSpaceStations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int ss[] = new int[m];
        for(int i=0;i<m;i++) {
            ss[i] = in.nextInt();
        }
        Arrays.sort(ss);
        int ssIndex = 0;
        int maxDistance = 0;
        for(int c=0;c<n;c++) {
            if(c == ss[ssIndex]) {
                continue;
            }
            if(ssIndex+1 < ss.length && c > ss[ssIndex+1]) {
                ssIndex++;
            }
            if(ssIndex+1 == ss.length) {
                maxDistance = Math.max(maxDistance, Math.abs(c-ss[ssIndex]));
            } else {
                maxDistance = Math.max(maxDistance, Math.min(Math.abs(c-ss[ssIndex]), Math.abs(c-ss[ssIndex+1])));
            }
            // System.out.println("c:"+c+", ss[ssIndex]:"+ss[ssIndex]+",ssIndex:"+ssIndex);
            //System.out.println("maxDistance:"+ maxDistance+ ", ssIndex:"+ ssIndex);
        }
        System.out.println(maxDistance);
    }
}
