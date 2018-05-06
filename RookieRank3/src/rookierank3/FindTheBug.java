/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rookierank3;
import java.util.*;
/**
 *
 * @author anisha
 */
public class FindTheBug {

    /**
     * @param args the command line arguments
     */
    
    static int[] findTheBug(String[] grid){
        // Complete this function
        int[] result = new int[2];
        for(int i=0;i<grid.length;i++) {
            if(grid[i].contains("X")) {
                result[0] = i;
                result[1] = grid[i].indexOf("X");
                break;
            }
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        // Return an array containing [r, c]
        int[] result = findTheBug(grid);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "," : ""));
        }
        System.out.println("");
        

    }
    
}
