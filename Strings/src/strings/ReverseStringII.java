package strings;

/**
 * Leetcode
 * Given a string and an integer k, you need to reverse the first k characters 
 * for every 2k characters counting from the start of the string. If there are 
 * less than k characters left, reverse all of them. If there are less than 2k 
 * but greater than or equal to k characters, then reverse the first k characters 
 * and left the other as original.
 * @author anisha
 */
public class ReverseStringII {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for(int i=0;i<len;i+=2*k) {
            if(i+k > len) {
                StringBuilder subWord = new StringBuilder(s.substring(i,len));
                subWord = subWord.reverse();
                sb.append(subWord);
            } else if(i+2*k > len) {
                StringBuilder subWord = new StringBuilder(s.substring(i,i+k));
                subWord = subWord.reverse();
                sb.append(subWord);
                sb.append(s.substring(i+k,len));
            } else {
                StringBuilder subWord = new StringBuilder(s.substring(i,i+k));
                subWord = subWord.reverse();
                sb.append(subWord);
                sb.append(s.substring(i+k,i+2*k));
            }
            
        }
        return sb.toString();
    }
}
