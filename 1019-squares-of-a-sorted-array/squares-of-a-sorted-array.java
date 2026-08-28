class Solution {
    public int[] sortedSquares(int[] arr) {
        int[] nums=new int[arr.length];
        int posind=-1;
        for( int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                posind=i;
                break;
            }
        }

       
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        if(posind==-1){
        int idx=arr.length-1;
          for(int i=0;i<arr.length;i++){
            nums[i]=arr[idx];
            idx--;
          }
          return nums;
        } 
        
        int i=posind-1; int j=posind;
        int index=0;
        while(i>=0 && j<arr.length ){
            if(arr[i]<=arr[j]){
             nums[index]=arr[i];
             i--;
             index++;
            }
            else{
                nums[index]=arr[j];
                j++;
                index++;
            }
        }
        if(i>=0){
            for(int k=i;k>=0;k--){
                nums[index]=arr[k];
                index++;
            }
            }
        else{
            for(int k=j;k<arr.length;k++){
                nums[index]=arr[k];
                index++;
            }
        }
        
        return nums;
       
    }

}