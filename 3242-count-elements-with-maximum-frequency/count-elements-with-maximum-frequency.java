class Solution {
    public int maxFrequencyElements(int[] nums) {
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
      int maxfreq=0;
        for(int ele:map.keySet()){
        int freq=map.get(ele);
        if(freq>maxfreq){
            maxfreq=freq;
        }
        }

        int count=0;
        for(int ele:map.keySet()){
            int freq=map.get(ele);
            if(freq>=maxfreq){
                count=count+maxfreq;
            }
        }
        return count;


    }
}