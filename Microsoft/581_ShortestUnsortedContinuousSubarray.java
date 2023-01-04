import java.util.*;
class Solution {
    public int findUnsortedSubarray(int[] nums) 
    {
        int dup[] = new int[nums.length];
        int s=0,e=0;
        System.arraycopy(nums, 0, dup, 0, nums.length);
        Arrays.sort(dup);
        for (int i=0; i<nums.length; i++)
        {
            if (nums[i] != dup[i])
            {
                s = i;
                break;
            }
        }
        for (int i=nums.length-1; i>=0; i--)
        {
            if (nums[i] != dup[i])
            {
                e = i;
                break;
            }
        }
        if (e==s)
        {
            return 0;
        }
        return (e-s)+1;
    }
}