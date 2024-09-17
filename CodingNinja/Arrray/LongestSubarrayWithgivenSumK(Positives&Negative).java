import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLongestSubarray(int []a, int k) {
		// Write your code here.
		int maxLen = 0;
        int n = a.length;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ;i<n;i++){
            sum+=a[i];

            if(sum ==k){
                maxLen =Math.max(maxLen, i+1);
            }

            int rem = sum-k;

            if(map.containsKey(rem)){
                int len = i-map.get(rem);
                maxLen = Math.max(len, maxLen);
            }

            if(!map.containsKey(sum)) map.put(sum, i);

        }
        return maxLen;

	}
}
