class Solution {
    public int findMiddleIndex(int[] nums) {

        int totalsum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalsum += nums[i];
        }
        int result = -1;
        int prefixsum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) prefixsum = 0;
               
            else prefixsum += nums[i - 1];
            int suffixsum = totalsum - prefixsum - nums[i];
            if (prefixsum == suffixsum)
                return i;

        }
        return -1;
    }
}