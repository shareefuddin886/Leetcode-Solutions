class Solution {
    public int longestOnes(int[] arr, int k) {
        int count=0;
        int Maxcount=0;
        int temp=k;
       for(int i=0;i<arr.length;i++)
        
{
    for(int j=i;j<arr.length;j++){
    if(arr[j]==1){
        count++;

    } 
    else if(temp!=0){
        count++;
        temp--;
    }
    else{
        
        break;
    }
    }
    Maxcount=Math.max(Maxcount,count);
    temp=k;
    count=0;

}
 Maxcount=Math.max(Maxcount,count);
return Maxcount;
    }
}