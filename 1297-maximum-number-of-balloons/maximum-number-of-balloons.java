class Solution {
    public int maxNumberOfBalloons(String s) {
       int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            char ele=s.charAt(i);
            if(ele=='b'|| ele=='a' || ele=='l' || ele=='o' || ele=='n'){
            int index=ele-'a';
            arr[index]=arr[index]+1;

        }
        }

       int b=0;int a=0; int l=0;int o=0; int n=0;
       String name="balon";
        for(int i=0;i<name.length();i++){
            char ele=name.charAt(i);
            int index=ele-'a';
           if(ele=='b'){
             b=arr[index];
           }
           else if(ele=='a'){
            a=arr[index];
           }
           else if(ele=='l'){
            l=arr[index];
           }
           else if(ele=='o'){
            o=arr[index];
           }
           else if(ele=='n'){
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