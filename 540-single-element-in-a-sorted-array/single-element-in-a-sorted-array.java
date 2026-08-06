class Solution {
    public int singleNonDuplicate(int[] arr) {
        if(arr.length==1) return arr[0];
        int i=0;int j=0;
        int count=0;
     
        while(j<arr.length){
            if(arr[i]==arr[j]){
                count++;
                j++;
            }
            else {
                if(count==1){
                    return arr[i];
                }
                else{
                    i=j;

                    count=0;
                }

            }
        }
        if(count==1){
            return arr[i];
        }
        return 0;
    }
}