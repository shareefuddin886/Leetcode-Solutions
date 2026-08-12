class Solution {
    public boolean isPalindrome(String s) {
         s = s.toLowerCase();
    s = s.replaceAll("[^a-z0-9]","");
   
    
    // 2. Safely check if the cleaned string is empty
    if (s.isEmpty()) { 
        return true; 
    }
    
    char[] arr = s.toCharArray();
    int i = 0; 
    int j = arr.length - 1;
    
    while (i <= j) {
        if (arr[i] != arr[j]) {
            return false; // Found a mismatch, definitely not a palindrome
        }
        i++; 
        j--;
    }
    return true;
    }
}