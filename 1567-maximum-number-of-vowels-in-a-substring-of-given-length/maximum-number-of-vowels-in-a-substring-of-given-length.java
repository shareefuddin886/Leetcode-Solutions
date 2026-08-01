class Solution {
    public int maxVowels(String s, int k) {
        char[] arr=s.toCharArray();
      int  Maxcount=0;
      int  count=0;
     for(int i=0;i<k;i++){
        if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
            count++;
        }
       
     }
      Maxcount=Math.max(count,Maxcount);
      for(int i=k;i<arr.length;i++){
       if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
            count++;
        }
        if(arr[i-k]=='a' || arr[i-k]=='e' || arr[i-k]=='i' || arr[i-k]=='o' || arr[i-k]=='u'){
            count--;
        }
        Maxcount=Math.max(Maxcount,count);
      }
      return Maxcount;

    }
}