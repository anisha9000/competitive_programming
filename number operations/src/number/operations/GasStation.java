/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations;

/**
 * leetcode
 * Return the starting gas station's index if you can travel around the 
 * circuit once in the clockwise direction, otherwise return -1.
 * @author anisha
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // check each start station one by one
        int totalStation = gas.length;
        int startIndex = -1;
        for(int i=0;i<totalStation;i++) {
            boolean canComplete = true;
            // go along the circuit and break if not possible.
            int j = i;
            int currGasStatus = 0;
            do {
                currGasStatus += (gas[j] - cost[j]);
                if(currGasStatus < 0) {
                    canComplete = false;
                    break;
                }
                j=(j+1) % totalStation;
                
            } while(j != i && currGasStatus >= 0);
            
            if(canComplete) {
                startIndex = i;
                break;
            }
            
        }
        return startIndex;
    }
}
