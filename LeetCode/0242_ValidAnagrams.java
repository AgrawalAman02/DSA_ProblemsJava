class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        s = s.toLowerCase();
        t = t.toLowerCase();
        char [] s1 = s.toCharArray();
        char [] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        boolean res = Arrays.equals(s1, t1);
        return res;
    }
}
