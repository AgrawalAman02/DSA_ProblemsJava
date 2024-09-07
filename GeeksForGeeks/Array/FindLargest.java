/*
Largest Element in Array
Difficulty: BasicAccuracy: 67.48%Submissions: 318K+Points: 1
Given an array, arr. The task is to find the largest element in it.
*/
class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i<arr.length; i++){
            if(arr[i]>max) max= arr[i];
        }
        
        return max;
    }
}
