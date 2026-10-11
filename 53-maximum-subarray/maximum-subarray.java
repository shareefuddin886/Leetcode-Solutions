class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
       int currsum=0;
       int maxsum=Integer.MIN_VALUE;
       for(int num:nums){
        currsum=Math.max(num,num+currsum);
        maxsum=Math.max(currsum,maxsum);
       }

       return maxsum;
    }
}