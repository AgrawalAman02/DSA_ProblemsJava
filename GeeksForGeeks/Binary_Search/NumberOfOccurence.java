class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int cnt = 0;
        int lo = 0;
        int hi = n-1;
        
        while(lo<= hi){
            int mid = lo+ (hi-lo)/2;
            
            if(arr[mid] == x){
                cnt++;
                
                int temp = mid-1;
                while(temp>= lo && arr[temp] == x){
                    cnt++;
                    temp--;
                }
                temp = mid+1;
                while(temp <= hi && arr[temp] == x){
                    cnt++;
                    temp++;
                }
                break;
            }else if(arr[mid]> x){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return cnt;
    }
}
