class Solution {
    public String longestCommonPrefix(String[] strs) {
    // Start with the first string as your baseline
   String prefix=strs[0];
   for(String ele:strs){
String currprefix="";
int minlen=Math.min(prefix.length(),ele.length());
    for(int i=0; i<minlen;i++){
       
       
       if(ele.charAt(i)==prefix.charAt(i)){
        currprefix=currprefix + ele.charAt(i);
       }
       
       else {
        prefix=currprefix;
        break;
       }
        

    }
    prefix=currprefix;
   }
   return prefix;

    
    }
}