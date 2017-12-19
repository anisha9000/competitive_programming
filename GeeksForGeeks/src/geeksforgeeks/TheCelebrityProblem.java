/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geeksforgeeks;

/**
 *
 * @author anisha
 */
public class TheCelebrityProblem {

    // The task is to complete this function
    int getId(int M[][], int n) {
        // Your code here
        for (int j = 0; j < n; j++) {
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if(i==j) {
                    if(M[i][j] != 0) {
                        flag = false;
                        continue;
                    }
                } else if (M[i][j] != 1 || M[j][i] != 0) {
                    flag = false;
                    continue;

                }

            }
            if (flag) {
                return j;

            }

        }
        return -1;
    }
}
