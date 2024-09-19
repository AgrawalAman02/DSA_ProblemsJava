class Solution {
    public void sortColors(int[] nums) {
        int i  =0,j=nums.length-1,k=0;
        while(k<=j){
            if(nums[k]==0){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                i++;
                k++;
            }else if(nums[k] == 2){
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                j--;
            }else if(nums[k]==1) k++;
            
        }

    }
}
