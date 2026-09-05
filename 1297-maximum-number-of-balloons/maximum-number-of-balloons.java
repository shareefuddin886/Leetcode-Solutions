class Solution {
    public int maxNumberOfBalloons(String s) {
        int[] arr=new int[26];
       char[] str=s.toCharArray();
        for(int i=0;i<str.length;i++){
            char ele=str[i];
           
            int index=ele-'a';
            arr[index]=arr[index]+1;

        
        }
        int a=0;
        int b=0;
        int l=0;
        int o=0;
        int n=0;
        char[] name={'b','a','l','o','n'};
        for(char keys:name){
            int index=keys-'a';
            if(keys=='b'){
               b=arr[index];
            }
            else if(keys=='a'){
               a=arr[index];
            }
            else if(keys=='l'){
              l=arr[index];
            }
            else if(keys=='o'){
                o=arr[index];
            }
            else if(keys=='n'){
               n=arr[index];
            }
        }
        if(b<1 || a<1 || l<2 || o<2 || n<1) return 0;
       int result=0;
       while(a!=0 && b!=0 && !(l<2) && !(o<2) && n!=0){
        result++;
        a--;
        b--;
        l=l-2;
        o=o-2;
        n--;
       }
        
        
        return result;
    }
}