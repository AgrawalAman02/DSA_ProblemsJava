class Solution {

    public int helper(int[] nums, int mid ){
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            int round = (int) Math.ceil((double) nums[i] / mid);
            sum+= round;
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        int lo = 1;
        int hi = max;
        int ans =-1;

        while(lo<=hi){
            int mid = lo+ (hi-lo)/2;

            int val = helper(nums,mid);
            if(val > threshold){
                lo = mid+1;
            }else{
                ans = mid;
                hi = mid-1;
            }
        }

        return ans;
    }
}
