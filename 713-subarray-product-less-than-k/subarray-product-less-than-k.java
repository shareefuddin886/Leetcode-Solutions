class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
             int product=1;
       for(int j=i;j<nums.length;j++){
       
        if(nums[j]*product<k){
            product=product*nums[j];
            count++;
        }
        else{
            break;
        }
       }
        }
        return count;
    }
    }
