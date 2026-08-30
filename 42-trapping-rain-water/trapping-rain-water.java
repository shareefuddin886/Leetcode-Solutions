class Solution {
    public int trap(int[] heights) {
        int ans=0;
        int n=heights.length;
       int l=0; int r=n-1;
        int lmax=0; int rmax=0;
        while(l<r){
            lmax=Math.max(lmax,heights[l]);
            rmax=Math.max(rmax,heights[r]);
            if(lmax<rmax){
                ans+=(lmax-heights[l]);
                l++;
            }
            else{
                ans+=(rmax-heights[r]);
                r--;
            }
        }

        
        return ans;

    }
}