/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations.hackerrank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class NumberOperationsHackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //modifiedFibonacci();
        //largeSum();
        //sumAndMultiple();
        bigDecimal();
    }
    
    private static BigInteger calculatetn(BigInteger t1, BigInteger t2, int n) {
        if(n == 3) {
            return (t1.add(t2.pow(2)));
        } else {
            n = n-1;
            return calculatetn(t2, t1.add(t2.pow(2)), n);
        }
    }
    
    private static void modifiedFibonacci() {
        Scanner scan = new Scanner(System.in);
        BigInteger t1 = scan.nextBigInteger();
        BigInteger t2 = scan.nextBigInteger();
        int n = scan.nextInt();
        scan.close();
        
        BigInteger tn = calculatetn(t1, t2, n);
        System.out.println(tn);
    }
    
    private static void largeSum() {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        BigInteger sum = new BigInteger("0");
        for(long i=0;i<n;i++) {
            BigInteger x = in.nextBigInteger();
            sum = sum.add(x);
        }
        System.out.println(sum.toString().substring(0, 10));
        in.close();
    }
    
    private static void sumAndMultiple() {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        
        BigInteger c = a.add(b);
        BigInteger d = a.multiply(b);
        System.out.println(c);
        System.out.println(d);
    }
    
    private static void bigDecimal() {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        
        Arrays.sort(s, Collections.reverseOrder());
        
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
        
    }
}
