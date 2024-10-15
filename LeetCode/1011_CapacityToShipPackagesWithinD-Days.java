class Solution {

    public int getDays(int [] weights, int cap){
        int days = 1;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            
            if (sum > cap) {
                days++;
                sum = weights[i]; // Started a new day with current weight
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weight, int days) {
        int n = weight.length;
        int lo = Integer.MIN_VALUE;
        int hi = 0;
        int ans  = -1;
        for(int i = 0 ; i<n ;i++){
            lo = Math.max(lo,weight[i]);
            hi+= weight[i];
        }

        while(lo<= hi){
            int mid = lo + (hi - lo)/2;

            int day = getDays(weight, mid);
            if(day> days){
                lo = mid+1;
            }
            else{
                ans = mid;
                hi = mid-1;
            }
        }

        return ans;
    }
}
