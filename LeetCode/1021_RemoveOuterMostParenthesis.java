class Solution {
    public String removeOuterParentheses(String s) {
        int track = 0;
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '(' && track >= 1){
                str.append('(');
                track++;
            }
            else if(ch == ')' && track >1){
                str.append(')');
                track--;
            }
            else if(ch=='(') track++;
            else track--;
        }
        return str.toString();
        
    }
}
