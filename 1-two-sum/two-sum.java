class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
      HashSet<Integer> set=new HashSet<>();
      int ele=0;
      for(int i=0;i<nums.length;i++){
          if(set.contains(target-nums[i])){
             ele=target-nums[i];
            arr[0]=i;
            break;
          }
          else{
            set.add(nums[i]);
          }
      }
       
      for(int i=0;i<nums.length;i++){
        if(nums[i]==ele){
            arr[1]=i;
            break;
        }
      }
      return arr;

    }
}