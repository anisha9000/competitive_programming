/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode
 * You need to return the sum of the points you could get in all the rounds.
 * @author anisha
 */
public class BaseballGame {
    public int calPoints(String[] ops) {
        int totalOps = ops.length;
        List<Integer> resultList = new ArrayList(totalOps);
        for(int i=0;i<totalOps;i++) {
            String currOp = ops[i];
            switch(currOp) {
                case "C": 
                    deleteLastEntry(resultList);
                    break;
                case "D":
                    doubleLastEntry(resultList);
                    break;
                case "+":
                    sumLastTwoEntry(resultList);
                    break;
                default:
                    resultList.add(Integer.parseInt(currOp));
            }
        }
        
        int totalSum = 0;
        int numOfScores = resultList.size();
        for(int i=0;i<numOfScores;i++) {
            totalSum += resultList.get(i);
        }
        return totalSum;
    }
    
    public void deleteLastEntry(List<Integer> resultList) {
        if(resultList.size() > 0) {
            resultList.remove(resultList.size()-1);
        }
    }
    
    public void doubleLastEntry(List<Integer> resultList) {
        if(resultList.size() > 0) {
            resultList.add(2*resultList.get(resultList.size()-1));
        }
    }

   public void sumLastTwoEntry(List<Integer> resultList) {
       int sum = 0;
       if(resultList.size() > 0) {
           sum+=resultList.get(resultList.size()-1);
       }
       if(resultList.size() > 1) {
           sum+=resultList.get(resultList.size()-2);
       }
       resultList.add(sum);
       
    }
}
