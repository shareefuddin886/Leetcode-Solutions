class Solution {
    int temp=0;
    public boolean isPowerOfFour(int n) {
        temp=n;
       return helper(1);
       
}

public boolean helper(long i){
    
    if(temp==i){
        return true;
    }
    else if(i>temp){
        return false;
    }
     
    return helper(i*4);
}
}

