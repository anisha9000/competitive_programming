/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.hackerrank;

import java.util.*;

/**
 *
 * @author anisha
 */
public class Encryption {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.replace(" ", "");
        int length = str.length();
        int row = (int) Math.floor(Math.pow(length, 0.5));  // row min
        int col = (int) Math.ceil(Math.pow(length, 0.5));  // col max
        int rowMin = row;
        int colMax = col;
        int areaMin = Integer.MAX_VALUE;
        for (int i = row; i <= col; i++) {
            for (int j = i; j <= col; j++) {
                if (i * j >= length) {
                    int tempArea = i * j;
                    if (areaMin > tempArea) {
                        rowMin = i;
                        colMax = j;
                        areaMin = tempArea;
                    }
                }
            }
        }
        int k = 0;
        //System.out.println(rowMin+","+colMax+","+length);
        char[][] charSeq = new char[rowMin][colMax];
        for (int i = 0; i < rowMin; i++) {
            for (int j = 0; j < colMax; j++) {
                if (k > length - 1) {
                    break;
                }
                charSeq[i][j] = str.charAt(k++);
            }
        }

        
        for (int i = 0; i < colMax; i++) {
            for (int j = 0; j < rowMin; j++) {
                if (charSeq[j][i] != 0) {
                    System.out.print(charSeq[j][i]);
                    
                }

            }
            System.out.print(" ");
        }

    }
}
