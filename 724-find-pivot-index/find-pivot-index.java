class Solution {
    public int pivotIndex(int[] arr) {
      
    //     for(int i=0;i<arr.length;i++){
    //     int leftsum=0;
    //     int rightsum=0;

    //    for(int j=0;j<i;j++ ){
    //     leftsum+=arr[j];
    //    }

    //    for(int j=i+1;j<arr.length;j++){
    //     rightsum+=arr[j];
    //    }

    //    if(leftsum==rightsum) return i;
    //     }
    //     return -1;

    int totalsum=0;
    for(int i=0;i<arr.length;i++){
        totalsum+=arr[i];
    }
   int leftsum=0;
    for(int i=0;i<arr.length;i++){
        if(leftsum==totalsum-leftsum-arr[i]){
            return i;
        }
        else{
            leftsum+=arr[i];
        }
    }
    return -1;
    }
}