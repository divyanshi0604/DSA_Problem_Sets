/*You are given an array. The task is to reverse the array and print it.
Examples:
Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position,
the second element occupies the fourth position and so on.
Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position,
the second element occupies the fourth position and so on.*/

import java.util.*;
public class PS_15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();

        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("The array is" + java.util.Arrays.toString(arr));
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}