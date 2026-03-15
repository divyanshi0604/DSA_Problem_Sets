/*22. Count pairs with given sum:-
Given an array arr[] of n integers and a target value, find the number of pairs of integers in the array
whose sum is equal to target.
Examples:
Example:-1
Input: arr[] = [1, 5, 7, -1, 5], target = 6
Output: 3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).
Example:-2
Input: arr[] = [1, 1, 1, 1], target = 2
Output: 6
Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1) and (1, 1).
Example:-3
Input: arr[] = [10, 12, 10, 15, -1], target = 125
Output: 0
Explanation: There is no pair with sum = target */
import java.util.*;
public class PS_22{
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

        System.out.println("Enter target");
        int target=sc.nextInt();
        
        int count=0;

        for(int i=0; i<n ; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        System.out.println(count); 
    }
}