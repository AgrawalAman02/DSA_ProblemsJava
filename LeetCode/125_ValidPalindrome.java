/*

class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        // here i learned this about the regex: regular expression 
        /*
            ^: In the context of a character class (inside square brackets), ^ negates the pattern. 
                It means “match any character that is NOT in the specified set.”
            a-zA-Z0-9: This part of the pattern specifies the set of characters we want to keep—namely, lowercase letters (a-z), 
                uppercase  letters (A-Z), and digits (0-9).
            So, the entire pattern "[^a-zA-Z0-9]" matches any character that is NOT an alphanumeric character.
        
        int i = 0, l = 0, r = str.length()-1;

        while(l<r){
            char left = str.charAt(l);
            char right = str.charAt(r);

            if(left != right){
                return false;
            }
            else{
                l++;
                r--;
            }
        }
        return true;
    }
}
*/
class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            // Move left pointer if the character is not alphanumeric
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                continue;
            }
            // Move right pointer if the character is not alphanumeric
            if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
                continue;
            }
            // Check if characters are equal (ignoring case)
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            // Move both pointers
            l++;
            r--;
        }
        return true;
    }
}
