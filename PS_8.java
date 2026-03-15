/*.Matrix Rotation by 90 Degrees:
Rotate a 2D matrix by 90 degrees clockwise.
Input: Matrix: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
Output:Matrix:[[7, 4, 1], [8, 5, 2], [9, 6, 3]]
Explanation: The matrix is rotated 90 degrees clockwise. */

import java.util.*;
public class PS_8{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // size of matrix
        int n = sc.nextInt();
        int[][] matrix= new int[n][n];

        // taking matrix input
        System.out.println("enter the matrix");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        // transpose of the matrix
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        // reverse the matrix
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }

        //pirnting the matrix
        System.out.println("Rotated Matrix:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}