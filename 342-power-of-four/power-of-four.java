class Solution {

    public boolean isPowerOfFour(int n) {
   for(long i=1;i<=n;i=i*4){
        if(i==n){
            return true;
        }
       }
        return false;
    }
    }

