class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      int[] arr1=new int[26];
      int[] arr2=new int [26];
      for(int i=0;i<magazine.length();i++){
        int index=magazine.charAt(i)-'a';
        arr1[index]=arr1[index]+1;
      }
      for(int i=0;i<ransomNote.length();i++){
        int index=ransomNote.charAt(i)-'a';
        arr2[index]=arr2[index]+1;
      }
     
    for(int i=0;i<26;i++){
        if(arr2[i]>arr1[i]) return false;
    }
        return true;
    }
}