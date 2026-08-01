// class Solution {
//     public int longestSubarray(int[] arr) {
//         int maxcount=0;
//         int count=0;
//         int k=1;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 if(arr[j]==1){
//                     count++;
//                 }
//                 else if(arr[j]==0){
//                     if(k>0){
//                         k--;
//                     }
//                     else {
//                         k=1;
//                         maxcount=Math.max(count,maxcount);
//                         count=0;
                       
//                     }
//                 }
//             }
           
//             if(k==1){
//                 count--;
//             }
//             maxcount=Math.max(count,maxcount);
//             k=1;
//             count=0;
//         }
//         return maxcount;
//     }
// }


class Solution {
    public int longestSubarray(int[] arr) {
        int maxcount = 0;

        for (int i = 0; i < arr.length; i++) {
            int zeros = 0;
            int count = 0;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    zeros++;
                } else {
                    count++;
                }

                // If we see more than one zero, this subarray is invalid
                if (zeros > 1) {
                    break;
                }

                // Update maxcount. If zeros == 0, we must delete one '1' anyway
                if (zeros == 1) {
                    maxcount = Math.max(maxcount, count);
                } else {
                    maxcount = Math.max(maxcount, count - 1);
                }
            }
        }
        return maxcount;
    }
}
