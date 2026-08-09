class Solution {
    public long maxArrayValue(int[] nums) {
        
        int n=nums.length-1;
     long sum=nums[n];
        for(int i=n-1;i>=0;i--){
            if(sum>=nums[i]){
                sum=sum+nums[i];
            }
            else{
                sum=nums[i];
            }
        }
        return sum;
    }
}