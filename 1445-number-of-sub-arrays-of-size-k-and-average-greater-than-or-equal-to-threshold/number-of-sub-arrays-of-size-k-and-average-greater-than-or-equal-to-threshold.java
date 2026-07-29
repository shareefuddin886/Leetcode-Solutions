class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int totalsum=0;
        int count=0;
        for(int i=0;i<k;i++){
          totalsum+=arr[i];     
        }
        if(totalsum/k>=threshold) count++;
        for(int i=k;i<arr.length;i++){
            totalsum+=arr[i];
            totalsum-=arr[i-k];
        if((totalsum/k)>=threshold) count++;
        }
        return count;
    }
}