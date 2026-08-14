class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double totalprice=0;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int n=prices.length-1;
        int j=discounts.length-1;
        for(int i=n;i>=0;i--){
            if(j>=0){
                totalprice=totalprice+((double)prices[i] * (100 - discounts[j])) / 100;
                j--;
            }
            else{
                totalprice=totalprice+prices[i];
            }

            
        }
        return totalprice;
    }
}