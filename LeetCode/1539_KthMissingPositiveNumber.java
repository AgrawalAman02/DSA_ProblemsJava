class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int lo = 0;
        int hi = n-1;

        if(arr[hi]- (hi+1)== 0) return arr[hi] +k; 

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int diff = arr[mid] - (mid+1);
            if(diff< k) lo  = mid+1;
            else hi = mid-1;
        }

        // if(arr[hi]- (hi+1)<k) return arr[hi] +(k- (arr[hi]- (hi+1)));
        // int diff = arr[lo] - (lo+1);
        // if (k - diff >= 0) {
        //     return arr[lo] + (k - diff);
        // } else {
        //     // In case k - diff becomes negative, though this case is very unlikely
        //     return arr[lo];
        return k + hi + 1;   // or lo + k as lo = hi + 1
        
    }
}
