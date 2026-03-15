/*37. String Rotation Check:-
Given two strings s and goal, return true if and only if s can become goal after some number of shifts
on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
For example, if s = "abcde", then it will be "bcdea" after one shift.
Example 1:
Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:
Input: s = "abcde", goal = "abced"
Output: false
 */

import java.util.*;

public class PS_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String goal = sc.next();

        if (s.length() != goal.length()) {
            System.out.println("false");
            return;
        }

        String doubles = s + s;

        if (doubles.contains(goal)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
