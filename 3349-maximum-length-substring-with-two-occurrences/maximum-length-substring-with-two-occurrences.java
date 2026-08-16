class Solution {
    public int maximumLengthSubstring(String s) {
        int[] arr = new int[26];

        int maxlen = 0;
        int i = 0;
        int j = 0;

        while (j < s.length()) {

            int index = s.charAt(j) - 'a';
            arr[index]++;

            // Window invalid hai → left se shrink karo
            while (arr[index] > 2) {
                int leftIndex = s.charAt(i) - 'a';
                arr[leftIndex]--;
                i++;
            }

            // Ab window valid hai
            maxlen = Math.max(maxlen, j - i + 1);

            j++;
        }

        return maxlen;
    }
}