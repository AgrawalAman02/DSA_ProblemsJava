// Initial approach but not optimal as .delete method is costly

class Solution {
    public String makeFancyString(String s) {
        int i =1;
        int n= s.length();
        StringBuilder str = new StringBuilder(s);
        while(i<str.length()-1){
            if(str.charAt(i) == str.charAt(i-1) && str.charAt(i) == str.charAt(i+1) ){
                str.delete(i,i+1);

            }else i++;
        }
        return str.toString();
    }
}

// Optimal Approach

class Solution {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;  // To track consecutive characters

        // Append the first character to the result
        result.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;  // Reset count for a new character
            }

            // Append the character only if it doesn't create a sequence of three or more
            if (count < 3) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
