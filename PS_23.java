/*23. Move Zeros to End
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the
non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:
Input: nums = [0]
Output: [0] */

import java.util.*;

public class PS_23 {
    public static void main(String[] args) {

        int nums[] = {0,1,0,3,12};

        int index = 0;

        // move non-zero elements forward
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != 0)
            {
                nums[index] = nums[i];
                index++;
            }
        }

        // fill remaining positions with 0
        while(index < nums.length)
        {
            nums[index] = 0;
            index++;
        }

        System.out.println(Arrays.toString(nums));
    }
}