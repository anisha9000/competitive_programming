/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluation;

import static Training.LinearRegression.loadListFromFile;
import static Training.LinearRegression.loadMatrixFromFile;
import static Training.LinearRegression.localMatrixMultiplication;
import java.util.List;

/**
 *
 * @author anisha
 */
public class LinearRegressionEvaluation {
    
    public static void main(String[] args) {
        String xcsvFiles = args[0];
        String ycsvFiles = args[1];
        String betacsvFile = args[2];
        
        List<Double[]> xList = loadMatrixFromFile(xcsvFiles);
        
        List<Double> yList = loadListFromFile(ycsvFiles);
        
        List<Double> betaList = loadListFromFile(betacsvFile);
        
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
        
        len = betaList.size();
        Double[][] beta = new Double[len][1];
        for (int i = 0; i < len; i++) {
            beta[i][0] = betaList.get(i);
        }
        
        long startTime = System.currentTimeMillis();

        Double[][] predictedY = localMatrixMultiplication(x, beta);
        
        double error_sum = 0.0;
        
        int totalPredictions = predictedY.length;
        for(int i=0;i<totalPredictions;i++) {
            double err = predictedY[i][0] - y[i][0];
            error_sum+= Math.pow(err, 2);
        }
        
        double rmse = error_sum/totalPredictions;
        
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        //TODO: push time to a csv file
        System.out.println("Avg time duration:" + elapsedTime);
        //writeToCSV(beta, output, "gamma1_clear");
        System.out.println("rmse:"+ rmse);

    }
    
}
