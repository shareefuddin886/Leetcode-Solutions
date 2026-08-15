class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        if (nums[0] > 1)
            return 1;
        if (nums.length == 1 && nums[0] == 1)
            return 2;
        int posindex = 0;
        int index=0;
        for ( index = 0; index < nums.length; index++) {
            
            if (nums[index] > 0) {
                posindex = index;
                break;
            }
             if(index==nums.length-1) return 1;
        }
        if (posindex == nums.length - 1){
            if(nums[index]==1) return 2;
            return 1;
        }
        if(nums[posindex] > 1) return 1;
       
        for (int i = posindex; i <= nums.length - 1; i++) {
            if (i == nums.length - 1)
                return nums[i] + 1;
            if(nums[i]==nums[i+1]) continue;
            if (nums[i] + 1 != nums[i + 1])
                return nums[i] + 1;

        }

        return 1;
    }
}