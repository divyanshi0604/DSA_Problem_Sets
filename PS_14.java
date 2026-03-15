/*. Matrix Identity Check:
Problem: Write a program to check if two given matrices are identical.
Input:
Matrix A: [[1,1,1,1], [2,2,2,2], [3,3,3,3], [4,4,4,4]]
Matrix B: [[1,1,1,1], [2,2,2,2], [3,3,3,3], [4,4,4,4]]
Output:
Matrices are identical
 */

import java.util.*;
public class PS_14{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter matrix 1 size");
        int n=sc.nextInt();
        System.out.println("enter matrix");
        int[][] matrix1= new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter matrix 2 size");
        int m=sc.nextInt();
        System.out.println("enter matrix");
        int[][] matrix2= new int[m][m];


        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        // compare matrix size
        if (n!=m){
            System.out.println("non idential matrix");
        }

        Boolean identical=true;
        // comparing matrix elements
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1.length; j++){
                if((matrix1[i][j])!=(matrix2[i][j])){
                    identical=false;
                    break;
                }

            }
        }
        if(identical){
            System.out.println("matrixes are identical");
        }
        else{
            System.out.println("matrixes are non identical");
        }
    }
}