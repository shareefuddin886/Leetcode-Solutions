class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
       HashMap<Character,Character> map=new HashMap<>();
       int i=0;int j=0;
       while(i<s.length() && j<t.length()){
        if(!map.containsKey(s.charAt(i))){
            // BUG FIX: Check if the value is already mapped to a different character
                if (map.containsValue(t.charAt(j))) {
                    return false;
                }
            map.put(s.charAt(i),t.charAt(j));
            i++;j++;
        }
        else{
            if(map.get(s.charAt(i))!=t.charAt(j)) return false;
            i++;j++;
        }
       }
        

      return true;
    }
}