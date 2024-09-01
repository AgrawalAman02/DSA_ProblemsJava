//my first approach

class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0 ; 
        int j  = 0;
        int len = needle.length();
        // int k   = 0;
        int count= -1;
        
        while(len<=haystack.length()){
            if(haystack.substring(i,len).equals(needle)){
                count = i;
                return count==-1 ? 0: count;
            }else{
                i++;
                len++;
            }
        }
        return count;

    }
}
