class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int currentCount = 0;
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                currentCount++;
                if (currentCount > max) {
                    max = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }
        
        return max;
    }
}
