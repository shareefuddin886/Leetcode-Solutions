class Solution {
    public int maxNumberOfBalloons(String s) {
       int[] arr=new int[26];
       char[] str=s.toCharArray();
        for(int i=0;i<str.length;i++){
            char ele=str[i];
           
            int index=ele-'a';
            arr[index]=arr[index]+1;

        
        }
      int result=Integer.MAX_VALUE;
     result=Math.min(result,arr['b'-'a']);
     result=Math.min(result,arr['a'-'a']);
     result=Math.min(result,arr['l'-'a']/2);
     result=Math.min(result,arr['o'-'a']/2);
     result=Math.min(result,arr['n'-'a']);

        
        
        return result;
    }
}