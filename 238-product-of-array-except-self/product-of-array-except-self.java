class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr1=new int[nums.length];
         int[] arr2=new int[nums.length];
         int[] result=new int[nums.length];
         int prefix=1;
         for(int i=0;i<nums.length;i++){
            if(i==0) arr1[i]=prefix;
            else{
                prefix=prefix*nums[i-1];
                arr1[i]=prefix;
            }
         }
        int suffix=1;
         for(int j=nums.length-1;j>=0;j--){
            if(j==nums.length-1){
                arr2[j]=suffix;
            }
            else{
                suffix=suffix*nums[j+1];
                arr2[j]=suffix;
            }
         }
         for(int k=0;k<nums.length;k++){
            result[k]=arr1[k]*arr2[k];
         }
         return result;
       
    }
}
