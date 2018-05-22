package arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author anisha
 */
public class PartitionLabels {
    
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        int[] endPosition = new int[26];
        int len = S.length();
        
        for(int i=0; i< len;i++) {
            endPosition[S.charAt(i)-'a'] = Math.max(i, endPosition[S.charAt(i)-'a']);
        }
        
        int startIndex = 0;
        int endIndex = 0;
        for(int i=0;i<len;i++) {
            endIndex = Math.max(endIndex, endPosition[S.charAt(i)-'a']);
            if(endIndex == i) {
                result.add(endIndex-startIndex+1);
                startIndex = i+1;
                endIndex = i+1;
            } 
            
        }
        
        return result;
    }
}
