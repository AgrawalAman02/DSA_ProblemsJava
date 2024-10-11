class Solution {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    
    static int findFloor(long arr[], int n, long x) {
        int floorval = -1;
        
        int lo  = 0;
        int hi= n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>x){
                hi = mid-1;
            }else{
                floorval =  mid;
                lo = mid+1;
            }
        }
        return floorval;
    }
}
