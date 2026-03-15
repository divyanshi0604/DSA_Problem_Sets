/*38. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without duplicate characters.
Example 1:
Input:s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:
Input:s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:
Input:s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring. */

public class PS_38 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        
        int n = s.length();
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            
            // Check every character from left to right for duplicates
            for (int k = left; k < right; k++) {
                if (s.charAt(k) == s.charAt(right)) {
                    left = k + 1;
                    break;
                }
            }

            // Update the maximum length 
            int len = right - left + 1;
            if (len > maxLen) {
                maxLen = len;
            }
        }

        System.out.println(maxLen);
    }
}
