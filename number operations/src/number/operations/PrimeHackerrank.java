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
public class PrimeHackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++) {
            int n = in.nextInt();
            if(n==2) {
                System.out.println("Prime");
            } else if(n%2==0) {
                System.out.println("Not prime");
            } else {
                boolean isPrime = true;
                for(int j=3;j<n/2;j+=2) {
                    if(n%j==0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not prime");
                }
            }
        }
        in.close();
    }
    
}
