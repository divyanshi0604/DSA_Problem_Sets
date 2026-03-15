/*34. Palindrome String:-
Given a string s, the task is to check if it is palindrome or not.
Example:
Input: s = "abba"
Output: true
Input: s = "abc"
Output: flase
Input: "madam"
Output: true */

import java.util.*;
public class PS_34{
    public static void main(String args[]){
        // method 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s= sc.nextLine();
        s=s.toLowerCase().replace(" ", "");

        boolean palindrome=true;
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                palindrome=false;
                break;
            }
            start++;
            end--;
        }

        if(palindrome){
            System.out.println(palindrome);
        }else{
            System.out.println(palindrome);
        }
    }
}