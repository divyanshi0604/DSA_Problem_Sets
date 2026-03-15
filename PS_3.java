/*Raj wants to know the maximum marks scored by him in each semester. The mark should be between
0 to 100; if it goes beyond the range display “You have entered invalid mark.”
Sample Input 1:
Enter no of semester: 3
Enter no of subjects in 1 semester: 3
Enter no of subjects in 2 semester: 4
Enter no of subjects in 3 semester: 2
Marks obtained in semester 1: 50 60 70
Marks obtained in semester 2: 90 98 76 67
Marks obtained in semester 3: 89 76
Sample Output 1:
Maximum mark in 1 semester: 70
Maximum mark in 2 semester: 98
Maximum mark in 3 semester: 89*/

import java.util.*;
public class PS_3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of semesters");
        int n= sc.nextInt();

        int[] subs= new int[n];
        for( int i=0; i<n ; i++){
            System.out.println("Enter number of subjects"  + i);
            subs[i]= sc.nextInt();
        }
        for(int i=0; i<n; i++){
            int max = -1;
                System.out.println("marks obtained in semester" + (i+1) + ":");

                for(int j=0; j<subs[i]; j++){
                int marks= sc.nextInt();

                if(marks<0 || marks>100){
                    System.out.println("You have entered invalid mark");
                }
                if(marks>max){
                    max=marks;
                }
                }System.out.println("maximum marks obtained in " + (i+1)  + " "+ "semester"+ ":"+ max);
            }
        }
    }
