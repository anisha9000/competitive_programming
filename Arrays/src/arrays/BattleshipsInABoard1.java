/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 * Leetcode
 * Given an 2D board, count how many battleships are in it. The battleships are 
 * represented with 'X's, empty slots are represented with '.'s. 
 * @author anisha
 */
public class BattleshipsInABoard1 {
    // O(n^2) solution, single pass, no extra memory, without modifying board
    public int countBattleships(char[][] board) {
        int count = 0;
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(board[i][j] == 'X') {
                    if(i-1>= 0 && board[i-1][j] == 'X') {
                        continue;
                    } else if (j-1 >= 0 && board[i][j-1] == 'X') {
                        continue;
                    } else {
                        count ++;
                    }
                }
            }
            
        }
        return count;
    }
}
