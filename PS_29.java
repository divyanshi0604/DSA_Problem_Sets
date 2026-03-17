/*29. Problem Statement –
Capgemini in its online written test have a coding question, wherein the students are given a string
with multiple characters that are repeated consecutively. You’re supposed to reduce the size of this
string using mathematical logic given as in the example below:
Input:
aabbbbeeeeffggg
Output:
a2b4e4f2g3 */
import java.util.*;

public class PS_29{
    public static void main(String[] args) {

        String str = "aabbbbeeeeffggg";
        int count = 1;

        for(int i = 0; i < str.length()-1; i++)
        {
            if(str.charAt(i) == str.charAt(i+1))
            {
                count++;
            }
            else
            {
                System.out.print(str.charAt(i) + "" + count);
                count = 1;
            }
        }

        // last character
        System.out.print(str.charAt(str.length()-1) + "" + count);
    }
}