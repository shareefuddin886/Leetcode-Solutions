class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
       
        int maxcandy=candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>maxcandy){
                maxcandy=candies[i];
            }
        }

        for(int i=0;i<candies.length;i++){
          if(candies[i]+extraCandies>=maxcandy){
            list.add(true);
          }
          else{
            list.add(false);
          }
        }
        return list;
    }
}