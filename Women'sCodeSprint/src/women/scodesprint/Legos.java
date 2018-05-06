/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package women.scodesprint;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class Legos {

    /**
     * @param args the command line arguments
     */
    static int productOfPages(int a, int b, int c, int d, int p, int q) {
        // Return the product of the page counts of the missing books
        int r,s;
        int[] numbers = new int[]{a,b,c,d};
        boolean[] isPresent = new boolean[4];
        boolean isPChoosen = false, isQChosen = false;
        if(a==p && !isPChoosen) {
            isPresent[0] = true;
            isPChoosen = true;
        } else if(a==q && !isQChosen){
            isPresent[0] = true;
            isQChosen = true;
        }
        
        if(b==p && !isPChoosen) {
            isPresent[1] = true;
            isPChoosen = true;
        } else if(b==q && !isQChosen){
            isPresent[1] = true;
            isQChosen = true;
        }
        
        if(c==p && !isPChoosen) {
            isPresent[2] = true;
            isPChoosen = true;
        } else if(c==q && !isQChosen){
            isPresent[2] = true;
            isQChosen = true;
        }
        
        if(d==p && !isPChoosen) {
            isPresent[3] = true;
            isPChoosen = true;
        } else if(d==q && !isQChosen){
            isPresent[3] = true;
            isQChosen = true;
        }
        
        
        int sum = 1;
        for(int i=0;i<4;i++) {
            if(isPresent[i] == false) {
                sum *= numbers[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int p = in.nextInt();
            int q = in.nextInt();
            int answer = productOfPages(a, b, c, d, p, q);
            System.out.println(answer);
        }
        in.close();
    }
    
}
