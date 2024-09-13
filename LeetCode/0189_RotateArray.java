/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/


// brute force approach -- yeah taking an extra space 


class Solution {
    public void rotate(int[] arr, int k) {
        
        int n = arr.length;
        k = k%n;   // if no. of rotation is more than the length of the array so we are finding the modulo of it
        if(arr.length == 1 || k== 0) return;   // if arr size is of length 1 or no. of rotation is of length == arrSize then it is the  same array , so return
        int temp[] = new int[n-k];    // storing the elements that are going to rotate in temp array thats why initialise that array 
        
        for(int i =0 ; i<n-k; i++){
            temp [i] = arr[i];
        }
        for(int i =0 ; i<k; i++){
            arr[i] = arr[n-k+i];
        }
        for(int i = 0; i<n-k; i++){
            arr[i+k] = temp[i];
        }
    }
}

/*
// Optimal Approach

// we will reverse the array for i---k-1 then from k to n-1 then whole reverse

// below one is little time complex but it dont takes extra space;

class Solution{
    public void reverse(int[] arr, int st, int end){
        int i = st; int j = end;
        while(st< end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    public void rotate(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        if(arr.length == 1 || k== 0) return;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
}
*/
