/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations;

import java.util.Arrays;
import java.util.List;
import static number.operations.MatrixMultiplication.loadMatrixFromFile;
import static number.operations.MatrixMultiplication.writeToCSV;

/**
 *
 * @author anisha
 */
public class NewtonRaphsonAlgorithm {

    public static void main(String[] args) {
        String fileName1 = "/home/anisha/PPML Tests/output/gamma1_clear.csv";

        List<Double[]> xList = loadMatrixFromFile(fileName1);

        int row = xList.size();
        int col = xList.get(0).length;
        Double[][] A = new Double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j] = xList.get(i)[j];
            }
        }

        Double c = calculateTrace(A);
        System.out.println("Trace:" + c);

        // compute cinv using Newton Raphson
        Double cInv = computeCInv(c);

        System.out.println("cinv:" + cInv);
        System.out.println("cinv validation:" + c * cInv);

        Double[][] X = createIdentity(cInv, row);

        // Number of rounds = k = f+e
        X = newtonRaphsonAlgorithm(A, X, 20);

        writeToCSV(X, "/home/anisha/PPML Tests/output/", "inversion_clear");

        String fileName2 = "/home/anisha/PPML Tests/output/inversion_clear.csv";

        List<Double[]> xInvList = loadMatrixFromFile(fileName2);

        row = xInvList.size();
        col = xInvList.get(0).length;
        Double[][] AInv = new Double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                AInv[i][j] = xInvList.get(i)[j];
            }
        }

        Double[][] check = MatrixMultiplication.localMatrixMultiplication(A, AInv);
        writeToCSV(check, "/home/anisha/PPML Tests/output/", "inversion_validation");
        logMatrix("My Inversion:", AInv);
        
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
        System.out.println("A:" + A);
        System.out.println("X:" + X);
        //TODO revert nrRounds
        for (int i = 0; i < 10; i++) {
            Double AX = A * X;
            //System.out.println("AX:"+AX);
            Double subtractedAX = 2 - AX;
            X = X * subtractedAX;
            System.out.println("X:" + X);
        }
        //System.out.println("returning matrix inversion");
        return X;
    }

    static Double[][] newtonRaphsonAlgorithm(Double[][] A,
            Double[][] X, int rounds) {

        int n = A.length;

        for (int i = 0; i < rounds; i++) {
            // AX = DM(A.X)

            Double[][] AX = MatrixMultiplication.localMatrixMultiplication(A, X);

            Double[][] subtractedAX = subtractFromTwo(AX);

            X = MatrixMultiplication.localMatrixMultiplication(X, subtractedAX);

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
