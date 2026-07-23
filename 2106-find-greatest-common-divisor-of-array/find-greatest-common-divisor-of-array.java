class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int num1=nums[0];
        int num2=nums[nums.length-1];
        int minlen=Math.min(num1,num2);
        for(int i=minlen;i>=1;i--){
            if(num1%i==0 && num2%i==0) return i;

        }
        return -1;
    }
}