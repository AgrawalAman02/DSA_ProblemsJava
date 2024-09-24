class Solution {
    public int searchBS(int [] arr , int key, int lo,int hi){
        if(lo>hi) return -1;
        else{
            int mid = lo+ (hi-lo)/2;
            if(arr[mid]== key) return mid;
            else if(arr[mid]>key) return searchBS(arr,key,lo,mid-1);
            else{
                return searchBS(arr,key,mid+1,hi);
            }
        }
        
    }

    public int search(int[] nums, int target) {
        return searchBS(nums,target,0,nums.length-1);
    }
}
