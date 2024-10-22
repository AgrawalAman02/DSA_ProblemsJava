class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        
        int n = arr.length;
        int max = 0;
        int res = -1;
        
        for(int i = 0; i<n;i++){
            int lo = 0;
            int hi = arr[i].length-1;
            int idx = arr[i].length;
            
            while(lo<= hi){
                int mid = lo + (hi-lo)/2;
                if(arr[i][mid] == 1) {
                    idx = mid;
                    hi = mid -1;
                } else lo = mid+1;
            }
            
            int numOfOne = arr[i].length - idx;
            if(numOfOne > max) {
                max = numOfOne;
                res = i;
            }
        }
        return res;
    }
}
