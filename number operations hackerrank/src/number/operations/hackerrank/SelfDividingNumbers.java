/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations.hackerrank;
import java.util.*;
/**
 * Leetcode
 * A self-dividing number is a number that is divisible by every digit it contains.


 * @author anisha
 */
public class SelfDividingNumbers {

    public boolean[] isSelfDividing = new boolean[10000];
    public boolean[] numberAccessed = new boolean[10000];

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumberList = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            // curr num to access = i
            if (numberAccessed[i]) {
                if (isSelfDividing[i]) {
                    selfDividingNumberList.add(i);
                }
            } else {
                isSelfDividing[i] = computeSelfDividing(i);
                numberAccessed[i] = true;
                if (isSelfDividing[i]) {
                    selfDividingNumberList.add(i);
                }
            }

        }

        return selfDividingNumberList;
    }

    public boolean computeSelfDividing(int num) {
        //System.out.println("computing num:"+ num);
        boolean isSelfDividing = true;
        int originalNum = num;

        while (num > 0) {
            int digit = num % 10;
            num /= 10;

            if (digit == 0 || originalNum % digit != 0) {
                isSelfDividing = false;
                break;
            }
        }

        return isSelfDividing;

    }
}
