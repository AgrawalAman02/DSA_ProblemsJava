class Solution {
    public boolean isValid(String s) {
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch=='(') st.push(ch);
            else if(ch== '{') st.push(ch);
            else if(ch== '[') st.push(ch);
            else if(ch== ')') {
                if(st.isEmpty() || st.peek()!= '(') return false;
                else st.pop();
            }
            
            else if(ch== '}') {
                if(st.isEmpty() || st.peek()!= '{') return false;
                else st.pop();
            }
            
            else if(ch== ']') {
                if(st.isEmpty() || st.peek()!= '[') return false;
                else st.pop();
            }
        }
        return st.isEmpty();
    }
}
