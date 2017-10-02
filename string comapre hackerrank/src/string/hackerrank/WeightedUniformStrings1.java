/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.hackerrank;
import java.util.*;
/**
 *
 * @author anisha
 */
public class WeightedUniformStrings1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        s = new String(charArray);
        //System.out.println("s:"+s);
        StringBuilder sb = new StringBuilder(s);
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            boolean flag = false;
            for(int i=1;i<=x;i++) {
                String charToSearch = String.valueOf((char)(i+96));
                //System.out.println("charToSearch:"+charToSearch);
                String subString = "";
                if(x%i == 0) {
                    int k = x/i;
                    while(k>0) {
                        subString = subString + charToSearch;
                        k--;
                    }
                }
                //System.out.println("subString:"+subString);
                if(subString.length()>0 && s.contains(subString)) {
                    flag = true;
                    break;
                }
            }
            System.out.println(flag?"Yes":"No");
            // your code goes here
        }
    }
}
