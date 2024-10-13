class Solution {
    public boolean search(int[] nums, int target) {
        int  n = nums.length;
        int lo = 0, hi = n-1;

        while(lo<= hi){
            int mid  =  lo + (hi-lo)/2;
            if(nums[mid] == target ) return true;
            else{
                if(nums[mid] == nums[lo] && nums[mid]== nums[hi]) {   // shrink the search space
                    lo++;
                    hi--;
                    continue;
                }
                if(nums[mid]>=nums[lo]){
                    if(target >= nums[lo] && target <= nums[mid]){
                        hi = mid-1;
                    }else{
                        lo = mid+1;
                    }
                }
                else{
                    if(target<= nums[hi]&& target >= nums[mid]) lo = mid+1;
                    else hi = mid-1;
                }
            }
        }
        return false;
    }
}
