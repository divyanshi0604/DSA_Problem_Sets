/*4.Problem Statement –
Write a function to solve the following equation a³ + a²b + 2a²b + 2ab² + ab² + b³.
Write a program to accept three values in order of a, b and c and get the result of the above equation.
 */

import java.util.*;

public class PS_4{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = (int)Math.pow(a + b, 3);

        System.out.println(result);
    }
}