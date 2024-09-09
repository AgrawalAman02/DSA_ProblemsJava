import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp =  arr[0];
        for(int i = 1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;

    }
}
