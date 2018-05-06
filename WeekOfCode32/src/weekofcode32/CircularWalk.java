/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekofcode32;

import java.util.Scanner;

/**
 *
 * @author Anisha
 */
public class CircularWalk {
    static int circularWalk(int n, int s, int t, int[] r){
        // Complete this function
        if(s == t) {
            return 0;
        }
        if(r[s] == 0 && s != t) {
            return -1;
        } 
        int minJump = Integer.MAX_VALUE;
        for(int i=1;i<=r[s];i++) {
            minJump = Math.min(1+circularWalk(n, (s+i)%n, t, r), minJump);
        }
        for(int i=1;i<=r[s];i++) {
            minJump = Math.min(1+circularWalk(n, (n-i+s)%n, t, r), minJump);
        }
        return minJump;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int t = in.nextInt();
        int r_0 = in.nextInt();
        int g = in.nextInt();
        int seed = in.nextInt();
        int p = in.nextInt();
        int r[] = new int[n];
        r = computeR(r_0,g,seed,p,n);
        for(int i=0;i<n;i++) {
            System.out.print(r[i]+" ");
        }
        int result = circularWalk(n, s, t, r);
        System.out.println(result);
    }

    private static int[] computeR(int r_0, int g, int seed, int p, int n) {
        int r[] = new int[n];
        r[0] = r_0;
        for(int i=1;i<n;i++) {
            r[i] = (r[i-1]*g+seed) % p;
        }
        return r;
    }
}
