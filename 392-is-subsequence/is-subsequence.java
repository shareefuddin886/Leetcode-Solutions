class Solution {
    public boolean isSubsequence(String s, String t) {
        // if (s.isEmpty()) return true;
        // if(s.length()==1 && t.length()==1){
        //     if(s.charAt(0)==t.charAt(0)) return true;
        //     return false;
        // }
        int i=0; int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;j++;
            }
            else{
                j++;
            }
        }
        if(i==s.length()) return true;
        return false;
    }
}