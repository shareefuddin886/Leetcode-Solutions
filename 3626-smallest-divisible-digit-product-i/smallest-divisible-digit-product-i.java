class Solution {
    public int smallestNumber(int n, int t) {
        
        while(n<=100){
            int product=1;
            char arr[]=String.valueOf(n).toCharArray();
            for(int i=0;i<arr.length;i++){
              int actualproduct=arr[i]-'0';
              product=product*actualproduct;
            }
            if(product%t==0) return n;
            else{
                n++;
            }
             
        }
        return 0;
    }
}