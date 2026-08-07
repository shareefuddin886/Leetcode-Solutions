class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr=new int[nums.length];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) list.add(nums[i]);
        }
         for(int i=0;i<nums.length;i++){
            if(nums[i]<0) list.add(nums[i]);
        }
        int i=0;int j=nums.length/2;
        int k=0;

        while(j<list.size()){
         arr[k]=list.get(i);
         k++;
         arr[k]=list.get(j);
         k++;
         i++;j++;
        }
        return arr;

    }
}