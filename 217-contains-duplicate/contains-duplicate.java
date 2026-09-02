class Solution {
    public boolean containsDuplicate(int[] arr) {
        boolean result=false;
    //    int prev=0;int curr= 1;
       Arrays.sort(arr);
       for(int i=1;i<arr.length;i++){
        if(arr[i]==arr[i-1]){
            result=true;
            break;
        }
       
       }

       return result;
        
        
        }
    }

