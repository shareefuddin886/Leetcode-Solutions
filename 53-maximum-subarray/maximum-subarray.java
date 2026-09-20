class Solution {
    public int maxSubArray(int[] nums) {
        int currnum=0;
        int maxsum=Integer.MIN_VALUE;
        int totalsum=0;

        for(int i=0;i<nums.length;i++){
            currnum = Math.max(nums[i], currnum + nums[i]);
            maxsum=Math.max(maxsum,currnum);
          
        }
        return maxsum;
    }
}