/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date.and.time.hackerrank;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import sun.util.calendar.JulianCalendar;

/**
 *
 * @author anisha
 */
public class DayOfProgrammer {

    static String solve(int year) {
        String a = "";
        Calendar ca = Calendar.getInstance();
        if ((year < 1917) && (year % 4 == 0)) {
            a = getFormattedDate(ca, year, 255);
        } else if (year == 1918) {
            // 31 st jan ---> 14 feb
            // 13 days
            a = getFormattedDate(ca, year, 269);
        } else {
            a = getFormattedDate(ca, year, 256);
        }
        return a;
    }

    static String getFormattedDate(Calendar ca, int year, int day) {
        ca.set(ca.YEAR, year);
        ca.set(ca.DAY_OF_YEAR, day);
        SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");
        return f.format(ca.getTime());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
