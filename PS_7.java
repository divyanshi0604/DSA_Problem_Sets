/*7.Problem Statement –
Bela teaches her daughter to find the factors of a given number. When she provides a number to her
daughter, she should tell the factors of that number. Help her to do this, by writing a program. Write a
class FindFactor.java and write the main method in it.
Note:
If the input provided is negative, ignore the sign and provide the output. If the input is zero the output
should be 'No Factors'.
Sample Input:-
54
Sample Output:-
1,2,3,6,9,18,27,54 */

import java.util.*;
public class PS_7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n==0){
            System.out.println("No factors");
        }
        // handling negative value
        int num= Math.abs(n); 
        for(int i=1; i<=num; i++){
                if (n%i==0){
                    System.out.print(i + "," );
                }
            }
        }
    }
