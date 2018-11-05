/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 *
 * @author anisha
 */
public class RealToZqConvertor {

    static int e;
    static int f;
    static BigInteger q;
    static BigInteger pow2f;
        
    public static void main(String[] args) {
                
        e = 128;
        f = e;
        q = BigInteger.valueOf(2).pow(e + 2 * f + 1).nextProbablePrime();
        pow2f = BigInteger.valueOf(2).pow(f);
        System.out.println("q:"+q);
        System.out.println("Converted 0.0 to Zq:");
        System.out.println(realToZq(322406.02638419865431722743609739999999988312793824288362515225008011865017109434807328525941956531841725563936051912605762481689453125, f, q));
        System.out.println(realToZq(1.0, f, q));
        System.out.println(realToZq(-1.0, f, q));
        
        
        System.out.println("new a1:" + realToZq(((322406.026384198654317227436097399999999883127938 - 122406.0263)), f, q));
        System.out.println("new a2:" + realToZq(122406.0263, f, q));
    }

    
    /**
     * convert a Zq value to decimal
     * @param x value in reals
     * @param f bit resolution of decimal component
     * @param q prime field
     * @return BigDecimal of x 
     */
    public static BigDecimal ZqToReal(BigInteger x, int f, BigInteger q) {
        BigInteger partition = q.subtract(BigInteger.ONE)
                .divide(BigInteger.valueOf(2));
        System.out.println("partition:" + partition);
        BigInteger inverse = BigInteger.valueOf(2).pow(f);
        System.out.println("inverse:" + inverse);
        BigDecimal Zk;
        
        // If x is more than half of the field size, it is negative.
        if (x.compareTo(partition) > 0) {
            Zk = new BigDecimal(x.subtract(q));
        } else {
            Zk = new BigDecimal(x);
        }

        BigDecimal Q = Zk.divide(new BigDecimal(inverse), f, 
                RoundingMode.CEILING);
        return Q;
    }
    /**
     * convert a decimal value to over Zq
     * @param x value in reals
     * @param f bit resolution of decimal component
     * @param q
     * @return BigInteger of x in Z_q
     */
    public static BigInteger realToZq(double x, int f, BigInteger q) {
        // Our integer space must be at least 2^k
        BigDecimal X = BigDecimal.valueOf(x);
        BigDecimal fac = BigDecimal.valueOf(2).pow(f);
        X = X.multiply(fac);
        
        return X.toBigInteger().mod(q);
    }

}
