/*28. Counting Valleys:
Problem: Given a sequence of up and down steps during a hike, determine the number of valleys
traversed.
Input:
8
UDDDUDUU
Output:
1
Explanation: A valley is a sequence of consecutive steps below sea level. The example describes a
single valley. */

import java.util.*;

public class PS_28{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String path = sc.next();

        int altitude = 0;
        int valleys = 0;

        for(int i = 0; i < n; i++)
        {
            if(path.charAt(i) == 'U')
            {
                altitude++;

                if(altitude == 0)
                    valleys++;
            }
            else
            {
                altitude--;
            }
        }

        System.out.println(valleys);
    }
}