import java.util.ArrayList;
public class Solution {

    public static int cnt(ArrayList<Integer> arr, int idx){
        int cnt = 1;
        int sum = 0;
        for(int i = 0; i<arr.size();i++){
            sum += arr.get(i);
            if(sum >idx){
                sum= arr.get(i);

                cnt++;
            } 

        }
        return cnt;
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m>n) return -1;

        int lo = Integer.MIN_VALUE, hi = 0;
        for(int i = 0; i<arr.size();i++){
            lo = Math.max(lo, arr.get(i));
            hi += arr.get(i);
        }
        int res = -1;

        while(lo<= hi){
            int mid = lo + (hi-lo)/2;
            int cntStud = cnt(arr,mid);
            
            if(cntStud > m) lo = mid+1;
            else{
                res = mid;
                hi  = mid-1;
            }

        }
        return res;
    }
}
