/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Training;

import java.util.Arrays;
import static Training.LinearRegression.localMatrixMultiplication;

/**
 *
 * @author anisha
 */
public class NewtonRaphsonAlgorithm {
    
    int nrRounds = 20;

    public static void main(String[] args) {

    }

    static Double[][] computeNewtonRaphson(Double[][] A, String output) {
        int row = A.length;
        int col = A[0].length;
        
        Double c = calculateTrace(A);
        
        // compute cinv using Newton Raphson
        Double cInv = computeCInv(c);

        Double[][] X = createIdentity(cInv, row);

        // Number of rounds = k = f+e
        X = newtonRaphsonAlgorithm(A, X, 20);

        return X;
    }

    static Double[][] createIdentity(Double number, int n) {
        Double[][] I = new Double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    I[i][j] = number;
                } else {
                    I[i][j] = 0.0;
                }
            }
        }
        return I;
    }

    static Double calculateTrace(Double[][] matrix) {
        Double trace = 0.0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            trace += matrix[i][i];
        }
        return trace;
    }

    static Double computeCInv(Double c) {
        Double Xs = 0.00000001;
        return newtonRaphsonAlgorithmScalar(c, Xs);
    }

    static Double newtonRaphsonAlgorithmScalar(Double A,
            Double X) {
        //TODO revert nrRounds
        for (int i = 0; i < 20; i++) {
            Double AX = A * X;
            //System.out.println("AX:"+AX);
            Double subtractedAX = 2 - AX;
            X = X * subtractedAX;
        }
        //System.out.println("returning matrix inversion");
        return X;
    }

    static Double[][] newtonRaphsonAlgorithm(Double[][] A,
            Double[][] X, int rounds) {

        int n = A.length;

        for (int i = 0; i < rounds; i++) {
            // AX = DM(A.X)

            Double[][] AX = localMatrixMultiplication(A, X);

            Double[][] subtractedAX = subtractFromTwo(AX);

            X = localMatrixMultiplication(X, subtractedAX);

        }
        return X;
    }

    static Double[][] subtractFromTwo(Double[][] AX) {
        int marixSize = AX.length;
        Double[][] subtractedAX = new Double[marixSize][marixSize];
        for (int i = 0; i < marixSize; i++) {
            for (int j = 0; j < marixSize; j++) {
                if (i == j) {
                    subtractedAX[i][j] = 2 - AX[i][j];
                } else {
                    subtractedAX[i][j] = 0 - AX[i][j];
                }

            }
        }
        return subtractedAX;
    }

    public static void logMatrix(String variableName, Double[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.print(variableName + ": ");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.asList(matrix[i]));
        }
        System.out.println("");
    }

}
