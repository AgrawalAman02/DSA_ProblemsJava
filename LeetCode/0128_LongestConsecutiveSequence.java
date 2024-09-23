// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if (nums.length == 0) return 0;  // Handle empty array case
//         Arrays.sort(nums);
//         int longestSoFar = 1;
//         int longestMax = 1;
//         int curr = nums[0];
//         for(int i = 1; i<nums.length;i++){
//             if(nums[i]==curr+1) {
//                 longestSoFar++;
//                 longestMax = Math.max(longestMax, longestSoFar);  // Update the longest sequence
//             }else if(nums[i] == curr) continue;
//             else{
//                 longestSoFar =1;
//             }
//             curr = nums[i];
                
//         }
//         return longestMax;
//     }
// }

// above one take O(nLOG(n)) time complexity for sorting but we want in O(n) so we use hashset

class Solution{
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0; 

        
        Set<Integer> st = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            st.add(nums[i]);
        }
        int longestMax = 0;
        int curr = Integer.MAX_VALUE;
        for(int elem : st){
            if(!st.contains(elem-1)){
                curr = elem;
                int longest = 1;
                // longestMax = longest;

                int x = elem;
                while(st.contains(x+1)){
                    longest++;
                    x++;
                }
                longestMax = Math.max(longest,longestMax);

            }
        }
        return longestMax;
    }

}
