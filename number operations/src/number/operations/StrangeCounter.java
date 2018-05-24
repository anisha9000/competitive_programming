/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class StrangeCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger t = in.nextBigInteger();
        BigInteger currentTime = BigInteger.ONE;
        BigInteger currentCounter = BigInteger.valueOf(3);
        System.out.println("Compare:"+t.compareTo(currentTime.add(currentCounter)));
        while(t.compareTo(currentTime.add(currentCounter)) >= 0) {
            currentTime = currentTime.add(currentCounter);
            currentCounter = currentCounter.multiply(BigInteger.valueOf(2));
        }
        System.out.println(currentCounter.add(currentTime).subtract(t));
    }
}
