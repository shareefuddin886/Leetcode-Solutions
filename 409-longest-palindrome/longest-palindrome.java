class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
       char[] str=s.toCharArray();
       for(int i=0;i<str.length;i++){
        char ele=str[i];
        map.put(ele,map.getOrDefault(ele,0)+1);

       }

       
       int count=0;
       int oddcount=0;
      for(char ele:map.keySet()){
      int freq=map.get(ele);
      if(freq%2==0){
        count=count+freq;
      }
      
      else{
        count=count+freq-1;
        oddcount++;
      }
      }
      if(oddcount>0) return count+1;
      return count;
    }
}