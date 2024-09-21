//{ Driver Code Starts
// ......
// } Driver Code Ends

/*
Given an array arr[], with 0-based indexing, select any two indexes, i and j such that i < j.
From the subarray arr[i...j], select the smallest and second smallest numbers and add them, 
you will get the score for that subarray. Return the maximum possible score across all the subarrays of array arr[].

Examples :

Input : arr[] = [4, 3, 1, 5, 6]
Output : 11
Explanation : Subarrays with smallest and second smallest are:- [4, 3] smallest = 3,second smallest = 4
[4, 3, 1] smallest = 1, second smallest = 3
[4, 3, 1, 5] smallest = 1, second smallest = 3
[4, 3, 1, 5, 6] smallest = 1, second smallest = 3
[3, 1] smallest = 1, second smallest = 3
[3, 1, 5] smallest = 1, second smallest = 3
[3, 1, 5, 6] smallest = 1, second smallest = 3
[1, 5] smallest = 1, second smallest = 5
[1, 5, 6] smallest = 1, second smallest = 5
[5, 6] smallest = 5, second smallest = 6
Maximum sum among all above choices is, 5 + 6 = 11.
Input : arr[] = [5, 4, 3, 1, 6] 
*/


// User function Template for Java

class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(List<Integer> arr) {
        // Your code goes here
        int sum = 0; 
        int max = Integer.MIN_VALUE;
        
        int n = arr.size();
        int lo = 0;
        int hi = 1;
        int ansi=-1;
        int ansj= -1;
        for(int i = 0; i<n-1 ;i++){
            sum = arr.get(lo)+arr.get(hi);
            if(sum>max) {
                max=sum;
                ansi= lo;
                ansj= hi;
            }
            
            lo++;
            hi++;
            
        }
        return arr.get(ansi)+arr.get(ansj);
    }
}
