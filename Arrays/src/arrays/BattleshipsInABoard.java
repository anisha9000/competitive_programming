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
public class BattleshipsInABoard {
    public int countBattleships(char[][] board) {
        int count = 0;
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(board[i][j] == 'X') {
                    modifyBoard(board,visited,i,j,rows, cols);
                    count++;
                }
            }
            
        }
        return count;
    }
    
    public void modifyBoard(char[][] board, boolean[][] visited, int i, int j, int rows, int cols) {
        if(i<0 || i>= rows || j <0 || j>=cols || board[i][j] == '.' || visited[i][j]) {
            return;
        }
        board[i][j] = '.';
        visited[i][j] = true;
        if((i+1) < rows && !visited[i+1][j] &&board[i+1][j] == 'X') {
                modifyBoard(board,visited,i+1,j,rows, cols);
            }
            if((i-1) > 0 && !visited[i-1][j]  && board[i-1][j] == 'X') {
                modifyBoard(board,visited,i-1,j,rows, cols);
            }
            if((j+1) < cols && !visited[i][j+1]  && board[i][j+1] == 'X') {
                modifyBoard(board,visited,i,j+1,rows, cols);
            }
            if((j-1) > 0 && !visited[i][j-1]  && board[i][j-1] == 'X') {
                modifyBoard(board,visited,i,j-1,rows, cols);
            }
    }
}
