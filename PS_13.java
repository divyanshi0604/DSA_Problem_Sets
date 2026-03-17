/*13. Merge Intervals:
Problem: Given a collection of intervals, merge all overlapping intervals.
Input: Intervals: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Intervals [1,3] and [2,6] overlap, so they are merged into [1,6]. The others remain
unchanged. */

import java.util.*;

public class PS_13{
    public static void main(String[] args) {

        int[][] intervals = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];
        result.add(current);

        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0] <= current[1])
            {
                current[1] = Math.max(current[1], intervals[i][1]);
            }
            else
            {
                current = intervals[i];
                result.add(current);
            }
        }

        for(int[] arr : result)
        {
            System.out.println(Arrays.toString(arr));
        }
    }
}