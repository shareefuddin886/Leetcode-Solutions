class Solution {
    public char repeatedCharacter(String s) {
        int[] arr=new int[26];
        char result=' ';
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            arr[index]=arr[index]+1;
            if(arr[index]==2){
              result=s.charAt(i);
             break;
            }
        }
        return result;
    }
}