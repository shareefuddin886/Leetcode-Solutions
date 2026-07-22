class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> resultlist=new ArrayList<>();
        ArrayList<Integer> templist=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=nums[0];i<=nums[n-1];i++){
            templist.add(i);
        }
        int i=0;int j=0;
        while(i<nums.length || j<templist.size() ){
            if(nums[i]!=templist.get(j)){
                resultlist.add(templist.get(j));
                j++;
            }
            else{
                i++;j++;;
            }
        }
        return resultlist;
    }
}