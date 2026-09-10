class Solution {
    public String longestCommonPrefix(String[] strs) {
    // Start with the first string as your baseline
   String prefix=strs[0];
   for(String ele:strs){
     char[] str=ele.toCharArray();
String currprefix="";
int minlen=Math.min(prefix.length(),str.length);
    for(int i=0; i<minlen;i++){
       
       
       if(str[i]==prefix.charAt(i)){
        currprefix=currprefix + str[i];
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

