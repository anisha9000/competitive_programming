/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author anisha
 */
public class LinearRegression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String xcsvFiles = args[0];
        String ycsvFiles = args[1];
        String output = args[2];
        
        List<Double[]> xList = new ArrayList<>();
        for(String xFile: xcsvFiles.split(";")) {
            xList.addAll(loadMatrixFromFile(xFile));
        }
        
        List<Double> yList = new ArrayList<>();
        for(String yFile: ycsvFiles.split(";")) {
            yList.addAll(loadListFromFile(yFile));
        }

        int row = xList.size();
        int col = xList.get(0).length;
        Double[][] x = new Double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                x[i][j] = xList.get(i)[j];
            }
        }

        int len = yList.size();
        Double[][] y = new Double[len][1];
        for (int i = 0; i < len; i++) {
            y[i][0] = yList.get(i);
        }
        
        long startTime = System.currentTimeMillis();

        Double[][] xT = transposeMatrix(x);

        //TODO can do both local matrix multiplication in parallel
        Double[][] gamma1 = localMatrixMultiplication(xT, x);
        Double[][] gamma2 = localMatrixMultiplication(xT, y);

        Double[][] gamma1Inv = NewtonRaphsonAlgorithm.computeNewtonRaphson(gamma1, output);

        Double[][] beta = localMatrixMultiplication(gamma1Inv, gamma2);
        
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        //TODO: push time to a csv file
        System.out.println("Avg time duration:" + elapsedTime);
        writeToCSV(beta, output, "beta");

    }

    public static List<Double[]> loadMatrixFromFile(String sourceFile) {

        File file = new File(sourceFile);
        Scanner inputStream;
        List<Double[]> x = new ArrayList<>();

        try {
            inputStream = new Scanner(file);
            int row = 0;
            while (inputStream.hasNext()) {
                String line = inputStream.next();
                Double[] doubleValues = Stream.of(line.split(","))
                        .map(Double::valueOf).toArray(Double[]::new);

                x.add(doubleValues);

            }

            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return x;

    }
    
    public static List<Double> loadListFromFile(String sourceFile) {

        File file = new File(sourceFile);
        Scanner inputStream;
        List<Double> x = new ArrayList<>();

        try {
            inputStream = new Scanner(file);
            int row = 0;
            while (inputStream.hasNext()) {
                String line = inputStream.next();
                Double value = new Double(line.split(",")[0]);
                x.add(value);

            }

            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return x;

    }
    

    static Double[][] transposeMatrix(Double[][] x) {
        int rows = x.length;
        int cols = x[0].length;
        Double[][] xT = new Double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                xT[j][i] = x[i][j];
            }
        }
        return xT;
    }

    public static Double[][] localMatrixMultiplication(Double[][] a,
            Double[][] b) {

        int crows = a.length;
        int ccol = b[0].length;
        Double[][] c = new Double[crows][ccol];
        int m = a[0].length;

        for (int i = 0; i < crows; i++) {
            for (int j = 0; j < ccol; j++) {
                // dot product of ith row of a and jth row of b
                c[i][j] = 0.0;
                for (int k = 0; k < m; k++) {
                    c[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        return c;
    }

    public static void writeToCSV(Double[][] y, String outputPath,
            String filePrefix) {
        int rows = y.length;
        int cols = y[0].length;
        try {
            try (FileWriter writer = new FileWriter(outputPath + filePrefix
                    + ".csv")) {
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        writer.write(y[i][j] + ",");
                    }
                    writer.write("\n");
                }
            }
            //System.out.println("Written all lines");
        } catch (IOException ex) {
            Logger.getLogger(LinearRegression.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
