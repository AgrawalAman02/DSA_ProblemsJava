
/*
Sorted Array Search
Difficulty: BasicAccuracy: 48.03%Submissions: 264K+Points: 1
Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.


Example 1:

Input:
N = 5, K = 6
arr[] = {1,2,3,4,6}
Output: 1
Exlpanation: Since, 6 is present in 
the array at index 4 (0-based indexing),
output is 1.

*/


class Solution {
    static int search(int[] arr, int k, int st, int end){
        if(st>end) return -1;
        int mid = st + (end-st)/2;
        if(arr[mid] == k) return mid;
        else if(arr[mid] <k) return search(arr, k, mid+1, end);
        else return search(arr,k,st,mid-1);
        
        
    }
    
    static int searchInSorted(int arr[], int N, int K) {
        if(search(arr,K,0,arr.length-1)>-1) return 1;
        else return -1;
        // Your code here
    }
}
