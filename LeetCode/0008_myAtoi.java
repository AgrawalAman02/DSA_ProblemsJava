class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int sign = 1;
        int i = 0;
        int result = 0;
        int max = Integer.MAX_VALUE;

        // Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Check for optional sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '+') ? 1 : -1;
            i++;
        }

        // Process digits and handle overflow
        while (i < n) {
            int ch = s.charAt(i) - '0';
            if (ch < 0 || ch > 9) break;

            if (result > max / 10 || (result == max / 10 && ch > max % 10)) {
                return (sign == 1) ? max : Integer.MIN_VALUE;
            }

            result = result * 10 + ch;
            i++;
        }

        return sign * result;
    }
}
