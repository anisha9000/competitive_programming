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
public class ExtraLongFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        System.out.println(getFactorial(n));
    }

    private static BigInteger getFactorial(BigInteger n) {
        if(n.compareTo(BigInteger.ONE) < 1) {
            return n;
        } else {
            return n.multiply(getFactorial(n.subtract(BigInteger.ONE)));
        }
    }
}
