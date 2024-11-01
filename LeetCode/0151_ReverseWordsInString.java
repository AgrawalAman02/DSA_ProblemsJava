// my first approach 
class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String temp = "";
        StringBuilder str = new StringBuilder("");
        int cnt =0;
        for(int i = 0 ;i<n;i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                temp += ch;
                cnt = 0;

            }else{
                cnt++;
                if(cnt==1)  str.insert(0," "+temp);
                temp = "";
            }
        }
        str.insert(0,temp);
        if(str.charAt(0) == ' ') str.delete(0,1);
        n = str.length();
        if(str.charAt(n-1)==' ') str.delete(n-1,n);

        return str.toString();
    }
}
// my other approach 

class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String temp = "";
        StringBuilder str = new StringBuilder();
        boolean firstWord = true;  // Track the first word to handle spaces

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                temp += ch;
            } else if (!temp.isEmpty()) { // Only add to str if temp has a word
                if (firstWord) {
                    str.insert(0, temp);
                    firstWord = false;
                } else {
                    str.insert(0, temp+" ");
                }
                temp = "";
            }
        }

        // Add the last word if it exists
        if (!temp.isEmpty()) {
            if (!firstWord) str.insert(0, " ");
            str.insert(0, temp);
        }

        return str.toString();
    }
}
