/*32. First Unique Character in a String
Given a string s, find the first non-repeating character in it and return its index. If it does not exist,
return -1.
Example 1:
Input:s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.
Example 2:
Input:s = "loveleetcode"
Output: 2
Example 3:
Input: s = "aabb"
Output: -1
 */
import java.util.*;
public class PS_32{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.nextLine();
        // taking frequency of alphabet as array
        int[] frequency = new int[26];
        
        // comparing or taking difference of ascii value of a and ascii value of element at i position to get its index
        for(int i=0; i<s.length(); i++){
            frequency[s.charAt(i)-'a']++;
            ;
        }

        // comparing frequency of i to 1, if it is one return its index
        int index=-1;
        for(int i=0; i<s.length(); i++){
            if(frequency[s.charAt(i)-'a']==1){
                index=i;
            }
        }
        if (index!=-1){
            System.out.println(index);
        }
        
    


    }
}