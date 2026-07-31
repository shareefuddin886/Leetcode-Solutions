class Solution {
    public int longestOnes(int[] arr, int k) {

        int i = 0;
        int j = 0;

        int zeroCount = 0;
        int maxLen = 0;

        while (j < arr.length) {

            // Step 1: Current element ko window me include karo
            if (arr[j] == 0) {
                zeroCount++;
            }

            // Step 2: Agar window invalid ho gayi
            while (zeroCount > k) {

                // Left side se zero bahar gaya?
                if (arr[i] == 0) {
                    zeroCount--;
                }

                i++;
            }

            // Step 3: Ab window valid hai
            maxLen = Math.max(maxLen, j - i + 1);

            // Step 4: Window ko expand karo
            j++;
        }

        return maxLen;
    }
}