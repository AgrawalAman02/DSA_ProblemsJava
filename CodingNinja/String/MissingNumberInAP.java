import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int missingNumber(int[] arr, int n) 
    {
        // Write your code here
        int d = (arr[n-1]-arr[0])/n;
        int left = 0, right = n-1;

        while(left <right){
            int mid = left +  (right- left)/2;

            int exp = arr[0] + mid*d;
            if(exp == arr[mid]) left = mid+1;
            else{
                right = mid;
            }
        }
        return arr[0] + left*d;
    }
}

