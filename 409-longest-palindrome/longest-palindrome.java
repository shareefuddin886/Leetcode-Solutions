class Solution {
    public int longestPalindrome(String s) {
        int[] counts = new int[52];
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            char ch = str[i];

            if (ch >= 'a' && ch <= 'z') {
                counts[ch - 'a']++; // 0 to 25
            } else if (ch >= 'A' && ch <= 'Z') {
                counts[ch - 'A' + 26]++; // 26 to 51
            }
        }

        int count = 0;
        int oddcount = 0;
        for (int ele :counts) {
            int freq = ele;
            if (freq % 2 == 0) {
                count = count + freq;
            }

            else {
                count = count + freq - 1;
                oddcount++;
            }
        }
        if (oddcount > 0)
            return count + 1;
        return count;
    }
}