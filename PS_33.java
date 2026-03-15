/*33. Find the First Non-Repeated Character in a String:
Problem: Given a string, find the first character that does not repeat.
Input: String: "swiss"
Output: w
Explanation: 'w' is the first character that does not repeat in the string */

import java.util.*;
public class PS_32{
    public static void main(String args[]){
        unordered_maps<char, int>m;
        queue<int>Q;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.nextLine();
        