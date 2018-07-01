/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import static number.operations.IntegerRealInterchange.ZqToReal;
import static number.operations.MatrixMultiplication.loadBigIntMatrixFromFile;
import static number.operations.MatrixMultiplication.loadMatrixFromFile;

/**
 *
 * @author anisha
 */
public class ConvertZqToReal {

    public static void main(String[] args) {
        int e = 64;
        int f = 64;
        BigInteger q = BigInteger.valueOf(2).pow(e + 2 * f + 1).nextProbablePrime();
        BigInteger pow2f = BigInteger.valueOf(2).pow(f);
        
        String beta1Str = "/home/anisha/PPML Tests/output/y_1.csv";
        String beta2Str = "/home/anisha/PPML Tests/output/y_2.csv";
        List<BigInteger[]> beta1List = loadBigIntMatrixFromFile(beta1Str);
        List<BigInteger[]> beta2List = loadBigIntMatrixFromFile(beta2Str);

        int row = beta1List.size();
        int col = beta1List.get(0).length;
        BigInteger[][] beta1 = new BigInteger[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                beta1[i][j] = beta1List.get(i)[j];
            }
        }

        BigInteger[][] beta2 = new BigInteger[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                beta2[i][j] = beta2List.get(i)[j];
            }
        }

        for (int i = 0; i < row; i++) {
            //BigInteger g1 = new BigDecimal(beta1[i][0]).toBigInteger();
            //BigInteger g2 = new BigDecimal(beta2[i][0]).toBigInteger();
            
            //System.out.println("added:"+ beta1[i][0].add(beta2[i][0]).mod(q));

            //BigInteger g = g1.add(g2).mod(q);
            System.out.println(ZqToReal(beta1[i][0].add(beta2[i][0]).mod(q).divide(pow2f).mod(q), f, q));
            //System.out.println(ZqToReal(beta1[i][0].add(beta2[i][0].divide(pow2f)).mod(q), f, q));
        }
        //NewtonRaphsonAlgorithm.logMatrix("beta1", beta1);
        //NewtonRaphsonAlgorithm.logMatrix("beta2", beta2);

    }
}
