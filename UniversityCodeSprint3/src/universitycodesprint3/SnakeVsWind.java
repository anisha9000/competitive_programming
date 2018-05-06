/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitycodesprint3;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class SnakeVsWind {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char d = in.next().charAt(0);
        int x = in.nextInt();
        int y = in.nextInt();
        // Write Your Code Here
        int[][] time = new int[n][n];
        fillTime(time, n, x, y, d, 1);
        printTime(time, n);
        in.close();
    }

    private static void fillTime(int[][] time, int n, int x, int y, char d, int currTime) {
        time[x][y] = currTime;
        if (currTime > n * n) {
            return;
        }

        switch (d) {
            case 'e':
                if ((y + 1) < n && time[x][y + 1] == 0) {
                    //Along the wind
                    fillTime(time, n, x, y + 1, d, currTime + 1);
                } else if ((x - 1) >= 0 && time[x - 1][y] == 0) {
                    //Perpendicular
                    fillTime(time, n, x - 1, y, d, currTime + 1);
                } else if ((x + 1) < n && time[x + 1][y] == 0) {
                    fillTime(time, n, x + 1, y, d, currTime + 1);
                } else if ((y - 1) >= 0 && time[x][y - 1] == 0) {
                    // Against the wind
                    fillTime(time, n, x, y - 1, d, currTime + 1);
                }
                break;
            case 'w':
                if ((y - 1) >= 0 && time[x][y - 1] == 0) {
                    //Along the wind
                    fillTime(time, n, x, y - 1, d, currTime + 1);
                } else if ((x - 1) >= 0 && time[x - 1][y] == 0) {
                    //Perpendicular
                    fillTime(time, n, x - 1, y, d, currTime + 1);
                } else if ((x + 1) < n && time[x + 1][y] == 0) {
                    fillTime(time, n, x + 1, y, d, currTime + 1);
                } else if ((y + 1) < n && time[x][y + 1] == 0) {
                    //Against the wind
                    fillTime(time, n, x, y + 1, d, currTime + 1);
                }
                break;
            case 'n':
                if ((x - 1) >= 0 && time[x - 1][y] == 0) {
                    //Along the wind
                    fillTime(time, n, x - 1, y, d, currTime + 1);
                } else if ((y - 1) >= 0 && time[x][y - 1] == 0) {
                    //Perpendicular
                    fillTime(time, n, x, y - 1, d, currTime + 1);
                } else if ((y + 1) < n && time[x][y + 1] == 0) {
                    fillTime(time, n, x, y + 1, d, currTime + 1);
                } else if ((x + 1) < n && time[x + 1][y] == 0) {
                    //Against the wind
                    fillTime(time, n, x + 1, y, d, currTime + 1);
                }
                break;
            case 's':
                if ((x + 1) < n && time[x + 1][y] == 0) {
                    //Along the wind
                    fillTime(time, n, x + 1, y, d, currTime + 1);
                } else if ((y - 1) >= 0 && time[x][y - 1] == 0) {
                    //Perpendicular
                    fillTime(time, n, x, y - 1, d, currTime + 1);
                } else if ((y + 1) < n && time[x][y + 1] == 0) {
                    fillTime(time, n, x, y + 1, d, currTime + 1);
                } else if ((x - 1) >= 0 && time[x - 1][y] == 0) {
                    // Against the wind
                    fillTime(time, n, x - 1, y, d, currTime + 1);
                }
                break;

        }

    }

    private static void printTime(int[][] time, int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(time[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
