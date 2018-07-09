/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date.and.time.hackerrank;

import java.util.*;
/**
 *
 * @author anisha
 */
public class DateAndTimeHackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int date = scan.nextInt();
        int year = scan.nextInt();
        
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, date);
        
        System.out.println(c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH).toUpperCase());
        scan.close();
    }
    
}
