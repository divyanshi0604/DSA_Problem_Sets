/*25.Intersection of Two Arrays
Intersection of Two Arrays
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the
result must be unique and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted. */

import java.util.*;

public class PS_25{
    public static void main(String[] args) {

        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int num : nums1)
        {
            set1.add(num);
        }

        for(int num : nums2)
        {
            if(set1.contains(num))
            {
                result.add(num);
            }
        }

        System.out.println(result);
    }
}