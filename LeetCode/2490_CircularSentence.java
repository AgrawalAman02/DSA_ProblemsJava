class Solution {
    public boolean isCircularSentence(String sentence) {
        int n = sentence.length();
        if(n==1) return true;
        if(sentence.charAt(0)!= sentence.charAt(n-1)) return false;
        // String temp = "";
        
        for(int i = 0 ; i<n;i++){
            char ch = sentence.charAt(i);
            if(ch == ' '  && i + 1 < n){
                // if(sentence.charAt(i+1) != null){
                    if(sentence.charAt(i-1) != sentence.charAt(i+1)) return false;
                // }
            }
        }
        return true;
    }
}
