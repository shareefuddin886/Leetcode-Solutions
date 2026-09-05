class Solution {
    public int rearrangeCharacters(String s, String target) {
              int[]  arr=new int[26];
             
              char[] str=s.toCharArray();
             
              for(int i=0;i<str.length;i++){
                int index=str[i]-'a';
                arr[index]=arr[index]+1;
              }
              int count=0;
              
            char[] tar=target.toCharArray();
          

while (true) {

    String name = "";

    for (int i = 0; i < tar.length; i++) {

        int index = tar[i] - 'a';

        if (arr[index] == 0) {
            return count;
        }

        arr[index]--;
        name += tar[i];
    }

    if (name.equals(target)) {
        count++;
    }
}

              
              
    }
}
