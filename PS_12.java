import java.util.*;
public class PS_12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();

        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }System.out.println("The array is" + java.util.Arrays.toString(arr));

        Arrays.sort(arr);
        int seconndsmallest=-1;
        for(int i=1; i<n; i++){
             if(arr[i]!=arr[0]){
        seconndsmallest=arr[i];
             }
        }
        int seconndlargest=-1;
        for(int i=n-2; i>=0; i--){
               if(arr[i]!=arr[n-1]){
                seconndlargest=arr[i];
               }
               
            }
            System.out.println(seconndsmallest);
            System.out.println(seconndlargest);
           }
    }