class Solution {
    public int maxNumberOfBalloons(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ele=s.charAt(i);
            if(ele=='b'|| ele=='a' || ele=='l' || ele=='o' || ele=='n'){
            if(!map.containsKey(ele)){
               map.put(ele,1);
            }
            else{
            int freq=map.get(ele);

            map.put(ele,freq+1);
            }
        }
        }
       int b=0;int a=0; int l=0;int o=0; int n=0;
        for(char keys:map.keySet()){
            if(keys=='b'){
               b= map.get(keys);
            }
            else if(keys=='a'){
                a=map.get(keys);
            }
            else if(keys=='l'){
                l=map.get(keys);
            }
            else if(keys=='o'){
                o=map.get(keys);
            }
            else if(keys=='n'){
                n=map.get(keys);
            }
        }
        if(b<1 || a<1 || l<2 || o<2 || n<1) return 0;
       int result=0;
       while(a!=0 && b!=0 && !(l<2) && !(o<2) && n!=0){
        result++;
        a--;
        b--;
        l=l-2;
        o=o-2;
        n--;
       }
        
        
        return result;
    }
}