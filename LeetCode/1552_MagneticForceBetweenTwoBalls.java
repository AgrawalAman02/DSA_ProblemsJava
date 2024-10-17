class Solution {

    public boolean canWePlace(int[] position , int m, int mid){
        int cnt = 1, last = position[0];
        for(int i = 1; i<position.length;i++){
            if(position[i]-last >= mid){
                cnt++;
                last = position[i];
            }
            if(cnt >= m){
                return true;
            }
        }
        return false;
    }
    
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n  = position.length;
        int lo = 0,hi = position[n-1];
        while(lo<= hi){
            int mid = lo + (hi-lo)/2;
            if(canWePlace(position, m,mid)){
                lo = mid +1;
            }else hi = mid-1;

        }
        return hi;
    }
}
