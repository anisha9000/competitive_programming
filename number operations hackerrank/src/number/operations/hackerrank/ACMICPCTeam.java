/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations.hackerrank;
import java.util.*;
/**
 *
 * @author anisha
 */
public class ACMICPCTeam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String language[] = new String[n];
        for(int i=0;i<n;i++) {
            language[i] = in.next();
        }
        int maxLanguage = Integer.MIN_VALUE;
        int maxTeam = 0;
        for(int i=0;i<n-1;i++) {
            String a = language[i];
            for(int j=i+1;j<n;j++) {
                String b = language[j];
                int count = 0;
                for(int k=0;k<m;k++) {
                    if(a.charAt(k) == '1' || b.charAt(k)=='1') {
                        count++;
                    }
                    
                }
                if(count == maxLanguage) {
                    maxTeam++;
                } else if(count > maxLanguage) {
                    maxTeam = 1;
                    maxLanguage = count;
                }
            }
        }
        
        System.out.println(maxLanguage);
        System.out.println(maxTeam);

        in.close();
    }
}
