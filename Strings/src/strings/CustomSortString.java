/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author anisha
 */
public class CustomSortString {
    public static String customSortString(String S, String T) {
        int totalLength = T.length();
        char[] Tchars = T.toCharArray();
        for(int i=0;i<totalLength;i++) {
            int j=i+1;
            System.out.println("at T index i:"+ Tchars[i]);
            while(j<totalLength) {
                if(S.indexOf(Tchars[i]) == -1 || S.indexOf(Tchars[j]) == -1) {
                    j++;
                    continue;
                }
                System.out.println("S.indexOf(Tchars[i]):"+ S.indexOf(Tchars[i]));
                System.out.println("S.indexOf(Tchars[j]):"+ S.indexOf(Tchars[j]));
                if(S.indexOf(Tchars[i]) > S.indexOf(Tchars[j])) {
                    char temp = Tchars[i];
                    Tchars[i] = Tchars[j];
                    Tchars[j] = temp;
                    //i--;
                } 
                j++;
                
            }
            
        }
        System.out.println("result:"+ new String(Tchars));
        return new String(Tchars);
    }
      
    public static void main(String[] args) {
        customSortString("cba", "abcd");
    }
}
