/*26. Problem Statement –
You have to write a function that accepts a string whose length is "len", the string has some "#" in it;
you have to move all the hashes to the front of the string and return the whole string back and print it.
Example:
Input:
Move#Hash#to#Front
Output:
MoveHashtoFront */

import java.util.*;

public class PS_26 {
    public static void main(String[] args) {

        String str = "Move#Hash#to#Front";

        int count = 0;
        String result = "";

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '#')
            count++;
            else
            result += str.charAt(i);
        }

        for(int i = 0; i < count; i++)
        result = "#" + result;

        System.out.println(result);
    }
}