class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();

    //    int prev=0;int curr= 1;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
            map.put(nums[i],1);
            }
            else {
                int freq=map.get(nums[i]);
                map.put(nums[i],freq+1);
            }
        }

        for(int ele:map.keySet()){
            if(map.get(ele)>1) return true;
        }
        return false;

        
        }
    }

