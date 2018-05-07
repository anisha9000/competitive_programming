/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class CollatzSequenceSum {
    static HashMap<Integer, Integer> seqCount = new HashMap<>();
	static int collatzSequenceLen(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (seqCount.containsKey(n)) {
            return seqCount.get(n);
        }
        if (n % 2 == 0) {
            seqCount.put(n, 1 + collatzSequenceLen(n/2));
        } else {
            seqCount.put(n, 1 + collatzSequenceLen(3*n+1));
        }
        return seqCount.get(n);
    }

    static int collatzSequenceSum(int T, int A, int B) {
        int n = 0;
        int result = 0;
        while (T-- > 0) {
            n = (A*n + B) % 5003;
            int best_len = 0;
            int best_num = 0;
            for (int k = 0; k <= n; ++k) {
                int cur_len = collatzSequenceLen(k);
                System.out.println(cur_len);
                if (cur_len >= best_len) {
                    best_len = cur_len;
                    best_num = k;
                }
            }
            result += best_num;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int result = collatzSequenceSum(T, A, B);
        System.out.println(result);
        in.close();
    }
}

