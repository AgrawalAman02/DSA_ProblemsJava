class Solution {
    public int search(int[] nums, int target) {
        int  n = nums.length;
        int lo = 0, hi = n-1;
        int ans = -1;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;

            if(nums[mid] == target) {
                ans = mid;
                break;
            } else if(nums[mid] < nums[n-1]){  // second sorted part
                if(nums[mid]< target && target <= nums[hi]) lo = mid+1;
                else{   // unsorted part
                    hi = mid-1;
                }
            }else{
                if(nums[mid] > target && target >= nums[lo]){
                    hi = mid-1;
                }else lo = mid+1;
            }
        }

        return ans;
    }
}
