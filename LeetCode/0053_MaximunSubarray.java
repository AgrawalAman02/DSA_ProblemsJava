class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max =Integer.MIN_VALUE;
        int sum   =0 ;

        for(int i=  0 ; i<n;i++){
            sum +=nums[i];

            if(sum>max){
                max = sum;
            }
            if(sum<0) sum =0;    // if sum is negative then why to carry that sum as it dont cntrubute to max sum.
        }
        return max;
    }
}
