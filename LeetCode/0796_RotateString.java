class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length(), m = goal.length();
        if(n!= m) return false;
        // char c = s.charAt(0);
        // int idx = -1;
        // for(int i = 0; i<m; i++){
        //     char ch = goal.charAt(i);
        //     if(ch == c) {
        //         idx = i;
        //         break;
        //     }
        // }
        // if(idx == -1) return false;
        // int i = 0, j = idx;
        // while(i<n){
        //     char ch = s.charAt(i);
        //     if(j==n) j = 0;
        //     char gh = goal.charAt(j);
        //     if(ch != gh) return false;
        //     i++;
        //     j++;

        // }
        // return true;

        // the above approach is correct for unique element but not for duplicates 
        // so we will concatenates and check for the substring

        String concats = s + s;
        return concats.contains(goal);
    }
}
