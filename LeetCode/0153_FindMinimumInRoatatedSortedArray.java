class Solution {
    public int findMin(int[] nums) {

        int lo = 0;
        int hi = nums.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            // If the mid element is greater than the last element, the minimum is in the right part
            if (nums[mid] > nums[hi]) {
                lo = mid + 1;
            } else {
                // Otherwise, the minimum is in the left part or mid itself
                hi = mid;
            }
        }

        // After the loop ends, lo == hi, pointing to the minimum element
        return nums[lo];
    }
}
