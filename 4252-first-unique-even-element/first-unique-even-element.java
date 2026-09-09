class Solution {
    public int firstUniqueEven(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        if(!map.containsKey(nums[i])){
            map.put(nums[i],1);
        }
        else{
            int freq=map.get(nums[i]);
            map.put(nums[i],freq+1);
        }
       }

       for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            int ele=map.get(nums[i]);
            if(ele==1) return nums[i];
        }
       }
       return -1;
    }
}