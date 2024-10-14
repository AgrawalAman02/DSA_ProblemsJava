class Solution {

    public int helper(int idx , int [] bloomDay,int k){
        int cnt = 0;
        int cnti  = 0;
        for (int i = 0; i< bloomDay.length;i++){

            if(bloomDay[i] <=idx) {
                cnti++;
                if(cnti % k==0) cnt++;
            }else cnti =0;
        }
        return cnt;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(m*k>n) return -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i  = 0;i<n;i++){
            max = Math.max(bloomDay[i],max);
            min = Math.min(bloomDay[i], min);
        }

        int lo = min, hi = max;
        while(lo<=hi){
            int mid = lo+ (hi-lo)/2;
            int num = helper(mid,bloomDay,k);
            if(num <m) lo = mid+1;
            else{
                hi = mid-1;
            }

        }
        return helper(lo, bloomDay, k) >= m ? lo : -1;
    }
}
