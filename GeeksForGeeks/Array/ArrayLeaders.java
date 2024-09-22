//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;


// } Driver Code Ends


class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        
        ArrayList<Integer> a= new ArrayList<>();
        
        int max = arr[n-1];
        a.add(max);
        for(int i = n-2;i>=0;i--){
            if(arr[i]>=max){
                a.add(arr[i]);
                max= arr[i];
            }
        }
        
        Collections.reverse(a);
        return a;
    }
}
