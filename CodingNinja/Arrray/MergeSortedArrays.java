import java.util.Arrays;

public class Solution {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        // Write your code here.
        long n = a.length;
        long m = b.length;

        int left = (int)n-1;
        int right = 0;

        while(left>=0 && right<m){
            if(a[left]>b[right]){
                long temp = a[left];
                a[left] = b[right];
                b[right] = temp;

                left--;
                right++;
            }
            else{
                break;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);
    }
}
