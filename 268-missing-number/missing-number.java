class Solution {
    public int missingNumber(int[] nums) {
        int totalsum=0;
        int actualsum=0;
        Arrays.sort(nums);

        for(int i=1;i<=nums.length;i++){
            totalsum=totalsum+i;
        }
        for(int i=0;i<nums.length;i++){
            actualsum=actualsum+nums[i];
        }
        return totalsum-actualsum;
    }
}