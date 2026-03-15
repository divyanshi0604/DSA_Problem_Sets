/*You’re given an array of integers, print the number of times each integer has occurred in the array.
Example:
Input:
10
1 2 3 3 4 1 4 5 1 2
Output:
1 occurs 3 times
2 occurs 2 times
3 occurs 2 times
4 occurs 2 times
5 occurs 1 times*/


import java.util.*;
public class PS_10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();

        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }System.out.println("The array is" + java.util.Arrays.toString(arr));

        Arrays.sort(arr);
        int count=1;
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                System.out.println(arr[i] + " occurs " + count + " times"  );
                count=1;
            }
        }System.out.println(arr[n-1] + " occurs " + count + " times"  );
    }}