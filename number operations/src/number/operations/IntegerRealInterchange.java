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
public class IntegerRealInterchange {

    /**
     * @param x value in reals
     * @param f bit resolution of decimal component
     * @return SMPCVariable of x in Z_q
     */
    public static BigInteger realToZq(double x, int f, BigInteger q) {
        // Our integer space must be at least 2^k
        // TODO: Does this need to be larger given more parties?
        BigDecimal X = BigDecimal.valueOf(x);
        BigDecimal fac = BigDecimal.valueOf(2).pow(f);
        X = X.multiply(fac);
        
        return X.toBigInteger().mod(q);
    }
    
    public static BigDecimal ZqToReal(BigInteger x, int f, BigInteger q) {
        BigInteger partition = q.subtract(BigInteger.ONE).divide(BigInteger.valueOf(2));
        BigInteger inverse = BigInteger.valueOf(2).pow(f);
        BigDecimal Zk;

        // If x is more than half of the field size, it is negative.
        if (x.compareTo(partition) > 0) {
            Zk = new BigDecimal(x.subtract(q));
        } else {
            Zk = new BigDecimal(x);
        }
        
        BigDecimal Q = Zk.divide(new BigDecimal(inverse), f, RoundingMode.CEILING);
        return Q;
    }
    
    public static void main(String[] args) {
        int e = 64;
        int f = 64;
        BigInteger prime = BigInteger.valueOf(2).pow(e + 2 * f + 1).nextProbablePrime();
        BigInteger pow2f = BigInteger.valueOf(2).pow(f);
        
        BigInteger A1 = new BigInteger("5343557");
        BigInteger A2 = new BigInteger("6445757");
        
        BigInteger A = A1.add(A2).mod(prime);
        
        System.out.println("A:" + ZqToReal(A, f, prime));
        
        BigInteger X1 = new BigInteger("184467440737095516");
        BigInteger X2 = new BigInteger("0");
        
        BigInteger X = X1.add(X2).mod(prime);
        System.out.println("X:" + ZqToReal(X, f, prime));
        
        BigInteger AXActual = A.multiply(X).divide(pow2f).mod(prime);
        System.out.println("actualAX:" + ZqToReal(AXActual, f, prime));
        
        BigInteger AX1 = new BigInteger("12554203470773361525387072918689482320983485277961723877540");
        BigInteger AX2 = new BigInteger("2318534164417944357538048281191586686877");
        
        BigInteger AX = AX1.add(AX2).mod(prime);
        
        BigInteger computedAX = AX1.add(AX2).mod(prime).divide(pow2f);
        
        System.out.println("computed AX:" + ZqToReal(computedAX, f, prime));
        
        BigInteger truncatedAX1 = new BigInteger("5976378805569634050142217762853528448965167968526597858913");
        BigInteger truncatedAX2 = new BigInteger("6577824665203727477529361083561804383241387594808842122104");
        
        BigInteger truncatedAX = truncatedAX1.add(truncatedAX2).mod(prime);
        
        System.out.println("truncated AX:" + ZqToReal(truncatedAX, f, prime));
        
        BigInteger subtractedAX = realToZq(2, f, prime).subtract(truncatedAX).mod(prime);
        
        System.out.println("subtracted AX:" + ZqToReal(subtractedAX, f, prime));
        
        BigInteger sAX1 = realToZq(2 * 0, f, prime).subtract(truncatedAX1).mod(prime);
        BigInteger sAX2 = realToZq(2 * 1, f, prime).subtract(truncatedAX2).mod(prime);
        
        System.out.println("distributed subtraction:" + ZqToReal(sAX1.add(sAX2).mod(prime), f, prime));
        
        BigInteger subtractedAX1 = new BigInteger("12554203470773361526481748038254098143923146795875605464206");
        BigInteger subtractedAX2 = new BigInteger("1155802571469140842001634910974641126323");
        
        BigInteger subtractedAXnew = subtractedAX1.add(subtractedAX2);
        
        System.out.println("subtracted AX:" + ZqToReal(subtractedAXnew, f, prime));
        
        BigInteger c1 = new BigInteger("12404154427680952441259183329898276847459068629798854228680");
        BigInteger c2 = new BigInteger("150049043092409086412395516517055984749331607943956707500");
        
        BigInteger c = c1.add(c2).mod(prime);
        
        System.out.println("cinv:" + ZqToReal(c, f, prime));
        
        System.out.println(realToZq(1, f, prime));
        System.out.println(realToZq(2, f, prime));
        System.out.println(realToZq(3, f, prime));
        System.out.println(realToZq(4, f, prime));
        
        BigInteger trace = new BigInteger("55340232221128654848");
        System.out.println("trace:" + ZqToReal(trace, f, prime));
        
        System.out.println("prime:" + prime);

        //computeTruncation();
        computeInverse();
        
    }
    
    public static void computeInverse() {
        
        int e = 64;
        int f = 64;
        BigInteger q = BigInteger.valueOf(2).pow(e + 2 * f + 1).nextProbablePrime();
        BigInteger pow2f = BigInteger.valueOf(2).pow(f);
        
        BigInteger[][] matrix = {{BigInteger.ONE, BigInteger.valueOf(2)}, 
            {BigInteger.valueOf(3), BigInteger.valueOf(4)}};
        
        BigInteger trace = calculateTrace(matrix);
        

        //element at position 0,0
        BigInteger ax1 = new BigDecimal("1.06355508969899E58").toBigInteger();
        BigInteger ax2 = new BigDecimal("1.91865257378351E57").toBigInteger();
        
        BigInteger ax = ax1.add(ax2).mod(q);
        System.out.println("AX:" + ZqToReal(ax, f, q));
        
        BigInteger g1 = new BigDecimal("5801114084578224331166539851342715217997212447920662361655").toBigInteger();
        BigInteger g2 = new BigDecimal("6753089386195137196505038995072617614209045814759772727985").toBigInteger();
        
        BigInteger g = g1.add(g2).mod(q);
        System.out.println("G:" + ZqToReal(g.divide(pow2f), f, q));
        
        BigInteger v1 = new BigInteger("6452945788337628665099152845309228077935856160059598223416");
        BigInteger v2 = new BigInteger("6101257682435732862572426001106104754279666783027074756983");
        
        BigInteger totalV=  v1.add(v2).mod(q);
        System.out.println("Shared:" + ZqToReal(totalV, f, q));
        
        BigInteger v = new BigInteger("42154979726173773453");
        
        System.out.println("Shared:" + ZqToReal(v, f, q));
        
//        
//        BigInteger a00 = new BigInteger("10050174281247886237751622337145076796232727814093306804717")
//                .add(new BigInteger("2504029189525475289919956509270256039672571626356865966847")).mod(q);
//        System.out.println("element at 0,0 = " + ZqToReal(a00, f, q));
//        
//        BigInteger a01 = new BigInteger("9071059289196146494461185691019850427033754938697678617652")
//                .add(new BigInteger("3483144181577215033210393155395482405166410672490628374688")).mod(q);
//        System.out.println("element at 0,1 = " + ZqToReal(a01, f, q));
//        
//        BigInteger a10 = new BigInteger("105075532579511989364012365457751706452549024607421395225")
//                .add(new BigInteger("12449127938193849538307566480957581125749948255031802484438")).mod(q);
//        System.out.println("element at 1,0 = " + ZqToReal(a10, f, q));
//        
//        BigInteger a11 = new BigInteger("11020603188369753055931926051921178379298693186877784124700")
//                .add(new BigInteger("1533600282403608471963690160311958897373634170215389051741")).mod(q);
//        System.out.println("element at 1,1 = " + ZqToReal(a11, f, q));
        
    }
    
    private static BigInteger calculateTrace(BigInteger[][] matrix) {
        int n = matrix.length;
        BigInteger trace = BigInteger.ZERO;
        for (int i = 0; i < n; i++) {
            trace = trace.add(matrix[i][i]);
        }
        return trace;
    }
    
    public static void computeTruncation() {
        int e = 64;
        int f = 64;
        BigInteger prime = BigInteger.valueOf(2).pow(e + 2 * f + 1).nextProbablePrime();
        BigInteger pow2f = BigInteger.valueOf(2).pow(f);
        
        double value1 = 10.5;
        double value2 = 5.5;
        
        BigInteger value1Zq = realToZq(value1, f, prime);
        BigInteger value2Zq = realToZq(value2, f, prime);
        
        System.out.println(value1Zq + "," + value2Zq);
        java.util.Random rand = new java.util.Random();
//        BigInteger a1 = new BigInteger(prime.bitLength(), rand).mod(prime);
//        BigInteger b1 = new BigInteger(prime.bitLength(), rand).mod(prime);
//        BigInteger a2 = (value1Zq.subtract(a1)).mod(prime);
//        BigInteger b2 = (value2Zq.subtract(b1)).mod(prime);

        BigInteger a1 = new BigInteger("12511664636892404160740533537512129287806439299602886385116");
        BigInteger b1 = new BigInteger("9906995270266055610915154304254535546399774008570429474359");
        BigInteger a2 = new BigInteger("42538833880957366931045308903203544591962402099132932709");
        BigInteger b2 = new BigInteger("2647208200507305916756424542160797285906393972763042085386");
        
        System.out.println("shares of input:" + a1 + ", " + a2 + " , " + b1 + ", " + b2);
        
        BigInteger mult = value1Zq.multiply(value2Zq).mod(prime);
        
        System.out.println("mult:" + mult);
        
        BigInteger w1 = new BigInteger("12554203470773361527589455587933334424038271428619774042643");
        BigInteger w2 = new BigInteger("19733429948166194673176323039492909194798");
        
        BigInteger wAdded = w1.add(w2).mod(prime);
        
        System.out.println("mult:" + wAdded);
        
        BigInteger r1 = new BigInteger("7955810151346053922430001753201029815075521908677726429566");
        BigInteger r2 = new BigInteger("8736674906387668949311229126525568160601586037535579948886");
        BigInteger R = new BigInteger("4138281586960361344069652033311265143472397057285237352595");
        
        BigInteger rAdded = r1.add(r2).mod(prime);
        
        System.out.println("r:" + R);
        System.out.println("r:" + rAdded);
        
        BigInteger Z = w1.add(r1).add(w2).add(r2).mod(prime);
        
        System.out.println("Z :" + Z);
        
        BigInteger Z1 = mult.add(R).mod(prime);
        
        System.out.println("Z :" + Z1);
        System.out.println("Z :4138281586960361363720958722995461408482280636469851564179");
        
        BigInteger roundOffBit = BigInteger.valueOf(2).pow(e + 2 * f - 1);
        BigInteger fInv = prime.add(BigInteger.ONE).divide(BigInteger.valueOf(2)).
                pow(f).mod(prime);
        BigInteger fpow2 = BigInteger.valueOf(2).pow(f);
        
        BigInteger c = Z.add(roundOffBit);
        BigInteger cp = c.mod(fpow2);
        
        System.out.println("c:" + c);
        
        BigInteger c1 = new BigInteger("7276832454653701745638853434599294616533458358701868820627");
        BigInteger cp1 = new BigInteger("16211448165894563987");
        
        System.out.println("cp:" + cp);
        
        BigInteger rp1 = new BigInteger("8799598695225456363713472818440645235011537249765441596103");
        BigInteger rp2 = new BigInteger("3754604775547905163958106027974687597209385087328521993741");
        BigInteger Rp = new BigInteger("16211448165894563987");
        
        System.out.println("Rp:" + Rp);
        System.out.println("Rp:" + rp1.add(rp2).mod(prime));
        
        BigInteger S = wAdded.add(Rp).mod(prime).
                subtract(cp);
        
        BigInteger S1 = new BigInteger("8799598695225456363631349559958646826845097789457146612889");
        BigInteger S2 = new BigInteger("3754604775547905183691535976140882270369496678655536624552");
        System.out.println("S:" + S);
        System.out.println("S:" + S1.add(S2).mod(prime));
        
        BigInteger T = S.multiply(fInv).mod(prime);
        BigInteger T1 = new BigInteger("2881559411650497013184960820592402346277580370925323958856");
        BigInteger T2 = new BigInteger("9672644059122864514486618025822930486992429988259471672825");
        System.out.println("T:" + T);
        System.out.println("T:" + T1.add(T2).mod(prime));
        
        System.out.println("realT:" + ZqToReal(T, f, prime));
        System.out.println("realT:" + ZqToReal(T1.add(T2).mod(prime), f, prime));
        System.out.println("realT:" + ZqToReal(T1, f, prime));
        System.out.println("realT:" + ZqToReal(T2, f, prime));
    }
    
    public static void calculateMatrixMultiplication(BigInteger[][] a, BigInteger[][] b) {
    }

}
