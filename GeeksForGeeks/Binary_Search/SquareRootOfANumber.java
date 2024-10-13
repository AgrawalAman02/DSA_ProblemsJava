/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    long floorSqrt(long n) {
        // Your code here
        if(n<4) return 1;
        long lo  = 2;
        long hi = n/2;
        long ans  = -1;
        
        while(lo<=hi){
            long mid = lo + (hi-lo)/2;
            if(mid * mid == n) return mid;
            else if(mid * mid > n) hi = mid-1;
            else{
                ans = mid;
                lo  = mid+1;
            }
        }
        
        return ans;
    }
}
