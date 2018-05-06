/*
Write a function that takes a string as input and returns the string reversed.
 */
public class ReverseString {
    public String reverseString(String s) {
        StringBuilder reverseBuilder = new StringBuilder();
        int len = s.length();
        for(int i = len-1;i>=0;i--) {
            reverseBuilder.append(s.charAt(i));
        }

        return reverseBuilder.toString();
    }
}
