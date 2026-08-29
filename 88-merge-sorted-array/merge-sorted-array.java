class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i=0;i<n;i++){
            nums1[m]=nums2[i];
            m++;
        }
        Arrays.sort(nums1);
    //    for(int k=1;k<nums1.length;k++){
    //     if(nums1[k]<nums1[k-1]){
    //         int temp=nums1[k];
    //         nums1[k]=nums1[k-1];
    //         nums1[k-1]=nums1[k];
    //     }
    //    } 
    }
}