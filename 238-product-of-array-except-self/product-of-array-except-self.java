class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr1=new int[nums.length];
        int product=1;
        boolean iszero=false;
        int count=0;
         for(int i=0;i<nums.length;i++){
          if(nums[i]==0){
         iszero=true;
         count++;
            continue;
          } 
          else product=product*nums[i];
         }

        if(iszero==true && count==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    arr1[i]=product;
                }
            }
        }
        else if(iszero==false){
            for(int i=0;i<nums.length;i++){
                arr1[i]=product/nums[i];
            }
        }
        return arr1;


       
    }
}
