class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length==1) return nums[0]+1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
      int   sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum=sum+nums[i];
            }
            else{
                for(int j=0;j<nums.length;j++){
                    if(set.contains(sum)){
                        sum++;
                    }
                    else{
                        return sum;
                    }
                }
            }
           
        }
        return sum;
    }
}