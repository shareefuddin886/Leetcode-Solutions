class NumArray {
     int[] prefixarray;
    public NumArray(int[] nums) {
         prefixarray=nums;
        int sum=0;
        for(int i=0;i<nums.length;i++){
          sum=sum+nums[i];
          prefixarray[i]=sum;
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return prefixarray[right];
        int leftsum=prefixarray[left-1];
        return prefixarray[right]-leftsum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */