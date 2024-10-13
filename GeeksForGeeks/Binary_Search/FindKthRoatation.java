/*
the approach is to find the index of minimum element bcoz that index tells the no. of rotation;
*/

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int n  = arr.size();
        int lo = 0, hi = n-1;
        
        while(lo< hi)
        {
            int mid = lo + (hi-lo)/2;
            
            if(arr.get(mid)>arr.get(hi)){
                lo = mid+1;
            }
            else{
                hi = mid;
            }
        }
        return lo;
    }
}
