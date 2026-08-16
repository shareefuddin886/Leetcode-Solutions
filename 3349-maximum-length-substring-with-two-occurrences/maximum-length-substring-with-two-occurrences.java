class Solution {
    public int maximumLengthSubstring(String s) {
        int maxlen = 0;
        int currlen = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] arr = new int[26];
            currlen = 0;

            for (int j = i; j< s.length(); j++) {
                int index = s.charAt(j) - 'a';
                arr[index] = arr[index] + 1;
                if (arr[index] > 2)
                    break;

                currlen++;

            }
            maxlen = Math.max(maxlen, currlen);
        }

        return maxlen;
    }
}