class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []result = new int[2];
        result[0] = -1;
        result[1] = -1;
        int n = nums.length;

        // Brute Force approach

        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j]==target) {
        //             result[0] = i;
        //             result[1] = j;
        //         }
        //     }
        // }

        // .Better approach

        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0 ; i<n; i++){
            if(mp.containsKey(target-nums[i])){
                result[0] = i;
                result[1] = mp.get(target-nums[i]);
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return result;
    }
}
