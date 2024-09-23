import java.util.Arrays;

public class Solution {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        if(a.length==0) return 0;
        Arrays.sort(a);
        int longest = 1;
        int longestMax = 1;
        int curr = a[0];
        for(int i = 1;i<a.length;i++){
            if(a[i]== curr+1){
                longest++;
                curr = a[i];
                if(longest>longestMax) longestMax = longest;
            } 
            else if(a[i]== curr){
                continue;
            } 
            else {
                longest = 1;
                curr = a[i];
            }
        }
        return longestMax;
//         21
// 15 6 2 1 16 4 2 29 9 12 8 5 14 21 8 12 17 16 6 26 3 

    }
}
