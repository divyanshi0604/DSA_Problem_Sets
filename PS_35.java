/*35. Longest Palindromic Substring
Longest Palindromic Substring
Given a string s, return the longest palindromic substring in s.
Example 1:
Input:s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:
Input:s = "cbbd"
Output: "bb" */

public class PS_35 {
    public static void main(String[] args) {
        String s = "babad";
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                
                boolean isPal = true;
                int left = i;
                int right = j;
                
                while (left < right) {
                    if (s.charAt(left++) != s.charAt(right--)) {
                        isPal = false;
                        break;
                    }
                }

                if (isPal) {
                    String sub = s.substring(i, j + 1);
                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }
        System.out.println(longest);
    }
}
