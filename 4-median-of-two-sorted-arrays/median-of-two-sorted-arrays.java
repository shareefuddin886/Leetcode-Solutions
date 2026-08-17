class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);
        int left=0; int right=list.size()-1;
        int mid=left+(right-left)/2;
        if(list.size()%2!=0) return (double)list.get(mid);

        double result=(list.get(mid)+list.get(mid+1))/2.0;
        return result;
    }
}