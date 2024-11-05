public class Solution {
    public static int makeBeautiful(String str) {
        int count = 0;
        int n = str.length(); int count1 = 0, count2 = 0; 
        // Check for the pattern starting with '0' 
        for (int i = 0; i < n; i++) { 
            if (i % 2 == 0 && str.charAt(i) != '0') {
                count1++; 
            } else if (i % 2 != 0 && str.charAt(i) != '1') { 
                count1++; 
            } 
        } // Check for the pattern starting with '1' 
        for (int i = 0; i < n; i++) { 
            if (i % 2 == 0 && str.charAt(i) != '1') { 
                count2++; 
            } else if (i % 2 != 0 && str.charAt(i) != '0') { 
                count2++; 
            } 
        } 
        return Math.min(count1, count2);
    }
}
