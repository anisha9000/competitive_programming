/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues.and.stack;

import java.util.*;

/**
 *
 * @author anisha
 */
public class SimpleTextEditor {

    static Stack<Operation> operationStack = new Stack<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "";

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int t = in.nextInt();
            int k = 0;
            switch (t) {
                case 1:
                    String w = in.next();
                    s = append(w, s, t);
                    //System.out.println("Apppended String:"+ s);
                    break;
                case 2:
                    k = in.nextInt();
                    s = delete(s,k,t);
                    //System.out.println("Deleted String:"+s);
                    break;
                case 3: 
                    k = in.nextInt();
                    System.out.println(s.charAt(k-1));
                    break;
                case 4:
                    s = undo(s);
                    //System.out.println("Undone string:"+s);

            }
        }
        in.close();
    }

    private static String append(String w, String s, int type) {
        operationStack.push(new Operation(type, w));
        return s + w;
    }

    private static String delete(String s, int k, int type) {
        String temp = s.substring(s.length() - k);
        operationStack.push(new Operation(type, temp));
        return s.substring(0, s.length() - k);
    }

    private static String undo(String s) {
        Operation item = (Operation)operationStack.pop();
        switch (item.operationType) {
            case 1:
                int subStrLen = item.subStr.length();
                s = s.substring(0, s.length() - subStrLen);
                break;
            case 2:
                s = s + item.subStr;
                break;
        }
        return s;
    }
}

class Operation {

    int operationType;
    String subStr;

    public Operation(int type, String str) {
        operationType = type;
        subStr = str;
    }

}
