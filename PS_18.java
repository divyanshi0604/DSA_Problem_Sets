/*Find Duplicate Number
Problem Statement: Given an array of N + 1 size, where each element is between 1 and N. Assuming
there is only one duplicate number, your task is to find the duplicate number.
Examples:
Example 1:
Input: arr=[1,3,4,2,2]
Output: 2
Explanation: Since 2 is the duplicate number the answer will be 2.
Example 2:
Input: [3,1,3,4,2]
Output:3
Explanation: Since 3 is the duplicate number the answer will be 3 */

import java.util.*;
public class PS_18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();

        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The array is" + java.util.Arrays.toString(arr));
        for(int i=0; i<n; i++){
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i]);
                break;
            }
            
        }
    }
}