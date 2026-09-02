class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(!map1.containsKey(magazine.charAt(i))){
                map1.put(magazine.charAt(i),1);
            }
            else{
                int freq=map1.get(magazine.charAt(i));
                map1.put(magazine.charAt(i),freq+1);
            }
        }

        for(int i=0;i<ransomNote.length();i++){
            if(!map2.containsKey(ransomNote.charAt(i))){
                map2.put(ransomNote.charAt(i),1);
            }
            else{
                int freq=map2.get(ransomNote.charAt(i));
                map2.put(ransomNote.charAt(i),freq+1);
            }
        }
        for(char ele:map2.keySet()){
            if(!map1.containsKey(ele)){
                return false;
            }
            else if(map2.get(ele)>map1.get(ele)) return false;
        }
        return true;
    }
}