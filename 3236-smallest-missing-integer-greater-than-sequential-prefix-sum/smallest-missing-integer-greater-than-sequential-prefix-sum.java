// class Solution {
//     public int missingInteger(int[] nums) {
//         if(nums.length==1) return nums[0]+1;
//         HashSet<Integer> set=new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             set.add(nums[i]);
//         }
//       int   sum=nums[0];
//         for(int i=1;i<nums.length;i++){
//             if(nums[i]==nums[i-1]+1){
//                 sum=sum+nums[i];
//             }
//             else{
//                 for(int j=0;j<nums.length;j++){
//                     if(set.contains(sum)){
//                         sum++;
//                     }
//                     else{
//                         return sum;
//                     }
//                 }
//             }
           
//         }
//         return sum;
//     }
// }


import java.util.Arrays;

class Solution {
    public int missingInteger(int[] nums) {
        // 1. Calculate prefix sum
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }
        
        // 2. Sort the array to find missing numbers sequentially
        Arrays.sort(nums);
        
        // 3. Scan the sorted array to find if 'sum' exists
        for (int num : nums) {
            if (num == sum) {
                sum++; // Increment if the current sum is found
            }
        }
        
        return sum;
    }
}
