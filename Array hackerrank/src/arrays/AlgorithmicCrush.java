/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.*;
/**
 *
 * @author Anisha
 */
public class AlgorithmicCrush {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long maxValue = Long.MIN_VALUE;
        long[] array = new long[n+1];
        for(int i=0;i<m;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            for(int j=a;j<=b;j++) {
                array[j] += k;
            }
        }
        for(int i=1;i<=n;i++) {
            if(array[i]>maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);
        in.close();
        
    }
}
