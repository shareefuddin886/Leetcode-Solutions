class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        
        // i grows exponentially: 1, 2, 4, 8, 16...
        for (long i = 1; i <= n; i = i * 2) {
            if (i == n) return true;
        }
        return false;
    }
}




// long  i=1;
//        while(i<n){
//         i=i*2;
//        }
//      return   i==n?true:false;