package booking.comchallenge;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class customerServiceCapacity {
    static int howManyAgentsToAdd(int noOfCurrentAgents, int[][] callsTimes) {
        int n = callsTimes.length;
        Job[] jobList = new Job[n];
        for(int i = 0;i<n;i++) {
            jobList[i] = new Job(callsTimes[i][0], callsTimes[i][1]);
        }
        Arrays.sort(jobList);
        return -1;
        

    }
    
    static class Job implements Comparable<Job> {

        long startTime;
        long endTime;
        
        public Job(long st, long et) {
            startTime = st;
            endTime = et;
            
        }
        @Override
        public int compareTo(Job o) {
            return (int)(endTime - o.endTime);
        }
    
    }
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int res;
        int noOfCurrentAgents;
        noOfCurrentAgents = Integer.parseInt(in.nextLine().trim());

        int callsTimes_rows = 0;
        int callsTimes_cols = 0;
        callsTimes_rows = Integer.parseInt(in.nextLine().trim());
        callsTimes_cols = Integer.parseInt(in.nextLine().trim());

        int[][] callsTimes = new int[callsTimes_rows][callsTimes_cols];
        for(int callsTimes_i = 0; callsTimes_i < callsTimes_rows; callsTimes_i++) {
            for(int callsTimes_j = 0; callsTimes_j < callsTimes_cols; callsTimes_j++) {
                callsTimes[callsTimes_i][callsTimes_j] = in.nextInt();

            }
        }

        if(in.hasNextLine()) {
          in.nextLine();
        }

        res = howManyAgentsToAdd(noOfCurrentAgents, callsTimes);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
