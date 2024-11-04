class Solution {
    public String compressedString(String word) {
        StringBuilder str = new StringBuilder();
        int n = word.length();
        int i = 0;

        while(i<n){
            char ch = word.charAt(i);
            int count = 0;
            while(i<n && word.charAt(i)==ch && count<9 ){
                count ++;
                i++;
            }

            str.append(count).append(ch);
        }

        return str.toString();
    }
}
