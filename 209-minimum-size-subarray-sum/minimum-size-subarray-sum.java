class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        // Edge case safety
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int i = 0; 
        int j = 0; 
        int sum = 0; // Start at 0 to keep addition clean
        int minlen = Integer.MAX_VALUE;

        while (j < arr.length) {
            // 1. Expand the window by adding the current element
            sum = sum + arr[j];

            // 2. Shrink window continuously from the left as long as sum >= target
            // This replaces your 'if(sum >= target)' to catch the minimum length!
            while (sum >= target) {
                minlen = Math.min(minlen, j - i + 1);
                sum = sum - arr[i];
                i++;
            }

            // 3. Move right pointer forward safely
            j++;
        }

        // If minlen was never changed, return 0
        if (minlen == Integer.MAX_VALUE) {
            return 0;
        }
        return minlen;
    }
}
