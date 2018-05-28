/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations;

import java.util.*;

/**
 *
 * @author anisha
 */
public class NPrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        HashMap<Integer, Long> map = new HashMap<>();
        
        int largestN = 1;
        long i = 3;
        map.put(1, i);
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            // If already found out, print
            if(map.containsKey(n)) {
                System.out.println(map.get(n));
                i = map.get(n);
                if(n > largestN) {
                    largestN = n;
                }
            } else {
                // find the prime numbers and store in map till count=n
                int count = largestN;
                while(count <= n) {
                    boolean isPrime = true;
                    for(long j = 3;j<i/2;j++) {
                        if(i%j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime) {
                        map.put(++largestN, i);
                        ++count;
                    }
                    i+=2;
                }
                System.out.println(map.get(n));
                if(n > largestN) {
                    largestN = n;
                }
            }
        }
        //System.out.println(map);
        in.close();

        
    }
    
}
