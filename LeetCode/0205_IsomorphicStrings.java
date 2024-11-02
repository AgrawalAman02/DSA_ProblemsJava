class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Character> mp = new HashMap<>();
        Set<Character> mappedValues = new HashSet<>();
        
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!mp.containsKey(ch)){
                if(mappedValues.contains(t.charAt(i))) return false;
                mp.put(ch,t.charAt(i));
                mappedValues.add(t.charAt(i));
            }else{
                char p = mp.get(ch);
                if(p!= t.charAt(i))  return false;
                continue;
            }
        }
        return true;
    }
}
