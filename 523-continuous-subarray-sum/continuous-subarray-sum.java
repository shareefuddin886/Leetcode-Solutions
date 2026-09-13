class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
      
            HashMap<Integer,Integer> map=new HashMap<>();
        int prefix=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            prefix=prefix+nums[i];
            int rem=prefix%k;
             if(rem==0 && i>=1) return true;
             if(!map.containsKey(rem)){
                map.put(rem,i);
               
            }
            else{
                int value=i-map.get(rem);
                if(value>=2){
                    return true;
                }
                
            }
            
        }
       
      
        
     return false;       
        
    }
}