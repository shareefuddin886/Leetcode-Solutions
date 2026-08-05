class Solution {
    public boolean isPalindrome(int x) {
       char[] arr=Integer.toString(x).toCharArray();
        int j=arr.length-1;
        for(int i=0;i<=j;i++){
            if(arr[i]!=arr[j]) return false;
            j--;
        }
        return true;
    }
}