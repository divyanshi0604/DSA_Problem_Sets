/*Binary Search:
Implement a binary search algorithm to find a target value in a sorted array.
Input: Array: [1, 2, 3, 4, 5, 6, 7, 8, 9], Target: 4
Output: 3
Explanation: The function returns the index of the target value in the array */

import java.util.*;
public class PS_9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();

        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }System.out.println("The array is" + java.util.Arrays.toString(arr));

        System.out.println("Enter target value");
        int target=sc.nextInt();

        // Binary search algo
        int left=0;
        int right= n-1;
        while(left<=right){
            int mid= (right + left)/2;
            if(arr[mid]==target){
                System.out.println(mid); 
                break;
            }
            else if(arr[mid]>target){
                right = mid -1 ;
            }
            else{
                left = mid +1 ;
            }
            
        }
    }
}