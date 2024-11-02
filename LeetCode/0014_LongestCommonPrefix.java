class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(strs == null || n==0) return "";
        if(n==1) return strs[0];

        String comp = strs[0];
        for(int i = 1; i<n ; i++){
            StringBuilder temp = new StringBuilder();
            int mini = Math.min(comp.length(), strs[i].length());

            for(int j = 0;j<mini;j++){
                char ch = strs[i].charAt(j);

                if(ch == comp.charAt(j)){
                    temp.append(ch);
                }else{
                    break;
                }
            }
            comp = temp.toString();
            if (comp.isEmpty()) return "";

        }

        return comp;
    }
}
