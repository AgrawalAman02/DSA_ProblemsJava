import java.util.Arrays;

public class Solution {

    public static boolean canWePlace(int[] arr,int mid,int k){
        int last = arr[0];
        int cntCows = 1;

        for(int i = 1;i<arr.length;i++){
            if(arr[i]-last >= mid){
                last = arr[i];
                cntCows++;
            }
            if(cntCows>=k) return true;
            
        }
        return false;
    }
    
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        int n = stalls.length;
        Arrays.sort(stalls);
        int lo = 0;
        int hi = stalls[n-1] - stalls[0];

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;

            if(canWePlace(stalls,mid,k)){
                lo = mid+1;
            }else{
                hi = mid-1;
            }

        }
        return hi;
    }
}
