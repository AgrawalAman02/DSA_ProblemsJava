import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{

	public static void swap(ArrayList<Integer> permutation, int i,int j){
		int temp = permutation.get(i);
		permutation.set(i, permutation.get(j));				
		permutation.set(j, temp);
	}

	public static void reverse(ArrayList<Integer> arr, int lo , int hi){
		while (lo < hi) {
            swap(arr, lo, hi);
            lo++;
            hi--;
        }
	}

	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		int n = permutation.size();
		int idx = -1;
		for(int i = n-2;i>=0;i--){
			if(permutation.get(i)<permutation.get(i+1)){
				idx = i;
				break;
			}
		}
		if(idx == -1){
			reverse(permutation,0,n-1);   // we can use Collections.reverse(arr);
			return permutation;
		}
		for(int i = n-1;i>idx;i--){
			if(permutation.get(i)>permutation.get(idx)){
				swap(permutation, i, idx);
				break;
			}
		}

		reverse(permutation,idx+1,n-1);

		return permutation;
	}
}
