/*
   Given an array arr, return the second largest distinct element from an array. If the second largest element doesn't exist then return -1.
*/

class Solution {
    public int print2largest(int[] arr) {
        // Code Here
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        
        for(int i = 0 ;i<arr.length; i++){
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
            
        }
      
         return (smax == Integer.MIN_VALUE) ? -1 : smax;
    
    }
}
