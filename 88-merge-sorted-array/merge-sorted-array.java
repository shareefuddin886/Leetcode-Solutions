import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Create the temporary array to hold sorted results
        int[] arr = new int[nums1.length];
        
        int i = 0;     // Pointer for nums1 valid elements
        int j = 0;     // Pointer for nums2
        int index = 0; // Pointer for our temporary array arr
        
        // Step 1: Compare elements from both arrays using boundaries m and n
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                arr[index] = nums1[i];
                i++;
            } else {
                arr[index] = nums2[j];
                j++;
            }
            index++;
        }
        
        // Step 2: If nums1 still has valid elements left, copy them
        while (i < m) {
            arr[index] = nums1[i];
            i++;
            index++;
        }
        
        // Step 3: If nums2 still has elements left, copy them
        while (j < n) {
            arr[index] = nums2[j];
            j++;
            index++;
        }
        
        // Step 4: Copy everything back from arr to nums1 as required
        for (int k = 0; k < nums1.length; k++) {
            nums1[k] = arr[k];
        }
    }
}
