/*Majority Element
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the
majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */

import java.util.*;
public class PS_24{
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

        // max element will always end up in middle
        int majority= arr[arr.length/2];
        System.out.println("majority element is" + majority);
    }
}