class Solution {
    public int minChanges(String s) {
        int count = 0; 
        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                count++; 
            } 
        } 
        return count;
    }
}

// or

class Solution {
    public int minChanges(String s) {
        int n = s.length();
        int i = 0;
        int count = 0;
        while(i+2<=n){
            String str = s.substring(i,i+2);
            if(str.charAt(0)!=str.charAt(1)){
                count ++;
            }


            i+=2;
        }
        return count;
    }
}
