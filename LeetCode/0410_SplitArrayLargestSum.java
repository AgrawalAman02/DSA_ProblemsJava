class Solution {

    public int cnt(int[] arr, int val){
        int cnt = 1;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum+=arr[i];
            if(sum >val){
                sum = arr[i];
                cnt++;
            }
        }
        return cnt;
    }

    public int splitArray(int[] nums, int k) {
        int lo  = Integer.MIN_VALUE;
        int hi = 0;
        for(int i = 0; i<nums.length; i++){
            lo = Math.max(lo,nums[i]);
            hi+=nums[i];
        }
        int res = -1;
        while(lo<= hi){
            int mid = lo + (hi-lo)/2;   
            int cntSum = cnt(nums,mid);
            if(cntSum > k){
                lo = mid+1;
            }else{
                res = mid;
                hi = mid-1;
            }
        }
        return res;
    }
}
