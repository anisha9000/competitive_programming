/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date.and.time.hackerrank;

import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author anisha
 */
public class NestedLogicHackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int actualDay = in.nextInt();
        int actualMonth = in.nextInt();
        int actualYear = in.nextInt();
        
        int dueDay = in.nextInt();
        int dueMonth = in.nextInt();
        int dueYear = in.nextInt();
        
        int fine = 0;
        
        if(actualYear < dueYear) {
            fine = 0;
        } else if(actualYear > dueYear) {
            fine = 10000;
        } else if(actualMonth < dueMonth) {
            fine = 0;
        } else if(actualMonth > dueMonth) {
            fine = 500*(actualMonth - dueMonth);
        } else if(actualDay > dueDay){
            fine = 15*(actualDay - dueDay);
        }
        System.out.println(fine);
        
        in.close();
    }
    
}
