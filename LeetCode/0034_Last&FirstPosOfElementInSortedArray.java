class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int n = nums.length;
        int lo = 0, hi = n-1;
        int res[] = new int[]{-1,-1};
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]== target){
                if(res[0] == -1 || res[0]>mid) res[0] = mid;
                if(res[1] == -1 || res[1]<mid) res[1] = mid;

                int temp = mid-1;
                while(temp >= lo && nums[temp] == target){
                    res[0] = temp;
                    temp--;
                }

                temp = mid+1;
                while(temp<= hi && nums[temp] == target){
                    res[1] = temp;
                    temp++;
                }
                break;
                
            } else if(nums[mid]>target){
                hi = mid-1;
            }else lo = mid+1;
        }

        if(res[0]!= -1 && res[1]== -1){
            res[1] = res[0];
            
        }
        return res;

    }
}
