class Solution {
    public int rearrangeCharacters(String s, String target) {
              int[]  arr=new int[26];
              int[] arr2=new int[26];
              char[] str=s.toCharArray();
              char[] tar=target.toCharArray();
              for(int i=0;i<str.length;i++){
                int index=str[i]-'a';
                arr[index]=arr[index]+1;
              }
               for(int i=0;i<tar.length;i++){
                int index=tar[i]-'a';
                arr2[index]=arr2[index]+1;
              }

              

              int result=Integer.MAX_VALUE;
             for(int i=0;i<tar.length;i++){
               int index=tar[i]-'a';
               int  currmin=arr[index]/arr2[index];
               result=Math.min(result,currmin);
             }

              return result;
              
    }
}