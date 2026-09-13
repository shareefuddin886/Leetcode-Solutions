class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length==1) return false;
        int[] prefixarr=new int[nums.length];
            HashMap<Integer,Integer> map=new HashMap<>();
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            prefix=prefix+nums[i];
            prefixarr[i]=prefix;
        }
       int index=0;
        map.put(0,-1);
        for(int ele:prefixarr){
            if(!map.containsKey(ele%k)){
                map.put(ele%k,index);
                index++;
            }
            else{
                int value=index-map.get(ele%k);
                if(value>=2){
                    return true;
                }
                index++;
            }
        }
        return false;
    }
}