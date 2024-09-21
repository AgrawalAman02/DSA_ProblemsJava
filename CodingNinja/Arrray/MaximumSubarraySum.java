import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long max = Long.MIN_VALUE;
		long sum = 0;
		for(int i = 0; i<n;i++){
			sum+= arr[i];
			if(sum>max) max = sum;
			if(sum<0) sum = 0;

		}
		return max<0?0:max;
	}

}
