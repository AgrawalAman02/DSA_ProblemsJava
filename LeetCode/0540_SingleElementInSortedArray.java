class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int lo = 0, hi = n-1;

        while(lo< hi){
            int mid = lo +(hi- lo)/2;

            // if(mid%2 !=0){
            //     if(nums[mid]== nums[mid-1])
            //     lo = mid+1;
            //     else  hi = mid-1;

            // }else{
            //     if(nums[mid]== nums[mid+1]) lo = mid+1;
            //     else hi = mid;
            // }
            

            // or we can shorten the code

            // Ensure mid is even for proper pairing check
            if (mid % 2 == 1) mid--;

            // If pair matches, move to the right half, otherwise left half
            if (nums[mid] == nums[mid + 1]) {
                lo = mid + 2;
            } else {
                hi = mid;
            }
        }

        
        return nums[lo];
    }
}
