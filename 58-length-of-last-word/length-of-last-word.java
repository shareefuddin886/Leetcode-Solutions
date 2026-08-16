class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        int count=0;
        int n=str.length()-1;
     for(int i=n;i>=0;i--){
         if(str.charAt(i)==' '){
            return count;
        } 
        
    else{
        count++;
      }
   
  } 
  return count;
}
}