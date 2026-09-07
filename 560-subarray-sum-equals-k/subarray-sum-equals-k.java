class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       map.put(0,1);
       int runningsum=0;
       int count=0;
        for(int i=0;i<nums.length;i++){

            runningsum+=nums[i];
            if(map.containsKey(runningsum-k)){
               count += map.get(runningsum - k);
              
              
            }
            map.put(runningsum, map.getOrDefault(runningsum, 0) + 1);
              
        }
       return count;
    }
}