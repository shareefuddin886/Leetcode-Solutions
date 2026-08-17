class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]==target){
                return 0;
            }
            else return -1;
        }
        if(nums[0]==target) return 0;
        else if(nums[nums.length-1]==target) return nums.length-1;
        int left=0;int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
         if(nums[mid]>=nums[left])  {
         if(target<nums[mid] && target>=nums[left]){
            right=mid-1;
        }
        else{ 
            left=mid+1;
        }
         }
        else if(nums[mid]<=nums[right]) {
           if(target>nums[mid] && target<=nums[right]){
           left=mid+1;
        }
        else right=mid-1;
        }
          
        }
        return -1;
    }
}