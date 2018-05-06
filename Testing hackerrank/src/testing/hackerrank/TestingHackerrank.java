/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing.hackerrank;

/**
 *
 * @author anisha
 */
public class TestingHackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t = 5;
        System.out.println(t);
        for(int i=3;i<=7;i++) {
            System.out.println(i+" "+ (i%t));
            int no = -1;
            for(int j=0;j<i;j++) {
                System.out.print(no++ + " ");
            }
            System.out.println();
        }
    }
    
}
