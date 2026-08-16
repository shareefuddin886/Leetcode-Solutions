class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;int j=0;
        int count=0;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                count++;
                j++;
            }
            else if(nums[i]!=nums[j]){
                if(count==1) return nums[i];
                else{
                    i=j;
                    count=1;
                    j++;
                }
            }
        }
        return nums[i];
    }
}