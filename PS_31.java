/*31. Check Valid Anagram:-
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
Input: s="listen", t= "silent"
Output: true. */


import java.util.*;

public class PS_31{
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a, b))
            System.out.println(true);
        else
            System.out.println(false);
    }
}