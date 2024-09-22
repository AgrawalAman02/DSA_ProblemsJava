class Solution {

    public int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int n = nums.length;
        int []result = new int[n];
        int i=0;        
        for(i = 0;i<n;i++){
            if(nums[i]<0){
                result[neg]=nums[i];
                neg+=2;

            }else{
                result[pos]= nums[i];
                pos+=2;
            }
        }
        return result;
    }
}
