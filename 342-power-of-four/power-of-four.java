class Solution {
    public boolean isPowerOfFour(int n) {
       long i=1;
       while(i<=n){
      if(i==n){
        return true;
      }
      i=i*4;
       }
       return false;
    }
}

