class Solution {
    public int maxRotateFunction(int[] nums) 
    {
      int m = 0, sum=0, t=0, len=nums.length;
      for (int i=0; i<nums.length; i++)
      {
          m += (i*nums[i]);
          sum += nums[i];
      }
      int res = m;
      for (int j=(nums.length-1); j>0; j--)
      {
        //   System.out.println("j: "+j);
          m = (m + sum) - (len * nums[j]);
        //   System.out.println("t: "+t);
          res = Math.max(res, m);
      }
      return res;
    }
}