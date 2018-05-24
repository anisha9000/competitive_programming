/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations;

import java.util.*;
/**
 *
 * @author anisha
 */
public class ViralAdvertising {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int reach = 5;
        int liked = 0;
        for(int i=0;i<n;i++) {
            liked += (reach/2);
            reach = (reach/2)*3;
        }
        System.out.println(liked);
        in.close();
    }
}
