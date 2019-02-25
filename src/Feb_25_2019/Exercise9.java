/*
 * https://leetcode.com/problems/palindrome-number/
 */

package Feb_25_2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        String s = Integer.toString(x);
        for(int i = 0; i < s.length(); i++){
            sb.append(s.charAt(i));
        }
        sb.reverse();
        return s.equals(sb.toString());
    }
}

public class Exercise9 {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            boolean ret = new Solution().isPalindrome(x);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
