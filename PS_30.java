/*30. Reverse a String:-
You are given a string s, and your task is to reverse the string.
Examples:
Input:s = "GLA"
Output: "ALG"
Input: s = "for"
Output: "rof"
Input: s = "a"
Output: "a"
Input: "Capgemini"
Output: "inimegpaC" */

import java.util.*;
public class PS_30{
    public static void main(String args[]){
        // method 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s= sc.nextLine();
        String reversed= " ";

        for(int i=s.length()-1; i>=0; i--){
            reversed+=s.charAt(i);
        }
        System.out.println(reversed);

        // method 2
        // convert string to character array
        char[] chararray = s.toCharArray(); 
        int start=0;
        int end=chararray.length-1;
        while(start<end){
            char temp=chararray[start];
            chararray[start]=chararray[end];
            chararray[end]=temp;
            start++;
            end--;
        }
        String reverse = new String(chararray);
        System.out.println(reverse);

    }
}