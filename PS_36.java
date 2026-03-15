/*36. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input:strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input:strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings. */

public class PS_36 {
    public static void main(String[] args) {
        String[] s = {"flower", "flow", "flight"};
        
        if (s == null || s.length == 0) {
            System.out.println("");
            return;
        }

        String prefix = s[0];

        for (int i = 1; i < s.length; i++) {
            while (s[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
               
                if (prefix.isEmpty()) {
                    System.out.println("");
                    return;
                }
            }
        }

        System.out.println("Longest Common Prefix: " + prefix);
    }
}
