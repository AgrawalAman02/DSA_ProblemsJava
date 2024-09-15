class Solution {
    public int singleNumber(int[] nums) {
        int element =0;
        for(int item : nums){
            element ^= item;
        }
        return element;
    }
}
