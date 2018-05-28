/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class Keywords {

    public int minimumLength(String text, ArrayList< String> keys) {
        String[] strArray = text.split(" ");
        int answer = 10000000;
        for (int i = 0; i < strArray.length; i++) {
            ArrayList< String> dup = new ArrayList<String>(keys);
            for (int k = 0; k < dup.size(); k++) {
                if (dup.get(k).equals(strArray[i])) {
                    System.out.println("Word dup found:"+strArray[i]);
                    dup.remove(k);
                }
            }
            for (int j = i; j < text.length(); j++) {
                if (dup.isEmpty()) {
                    answer = Math.min(answer, j - i);
                    break;
                }
            }
        }
        if (answer == 10000000) {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {

        Keywords s = new Keywords();
        String text, buf;
        ArrayList< String> keys = new ArrayList< String>();
        Scanner in = new Scanner(System.in);
        text = in.nextLine();
        int keyWords = in.nextInt();
        in.nextLine();
        for (int i = 0; i < keyWords; i++) {
            buf = in.nextLine();
            keys.add(buf);
        }

        System.out.println(s.minimumLength(text, keys));
    }
}
