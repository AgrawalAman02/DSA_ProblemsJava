import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> absDiff(ArrayList<Integer> arr, int n) {
		// Write your code here.
		if(n<2){
			ArrayList<Integer> res = new ArrayList<>();
			res.add(arr.get(0));
			res.add(0);
			return res;
		}
		if(n==2){
			return arr;
		}
		int even = arr.get(0);
		int odd =arr.get(1);


		int i = 0;
		for(i = 2; i<n ; i++){
			if(i%2==0)
			even = Math.abs(arr.get(i)-even);
			else
			odd = Math.abs(arr.get(i)-odd);
		}
		

		

		ArrayList<Integer> res = new ArrayList<>();
		res.add(even);
		res.add(odd);

		return res;
	}
}
