  /*
Problem statement
Given an array 'arr' of 'n' non-negative integers, your task is to move all the zeros to the end of the array while keeping the non-zero elements at the start of the array in their original order. 
Return the modified array.
Example :
Input: ‘n’ = 5, ‘arr’ = [1, 2, 0, 0, 2, 3]
Output: [1, 2, 2, 3, 0, 0]

Explanation: Moved all the 0’s to the end of an array, and the rest of the elements retain the order at the start.
Detailed explanation ( Input/output format, Notes, Images )
Sample input 1:
4
0 0 0 1 
Sample output 1:
1 0 0 0 
Explanation of sample input 1:
Output: [1, 0, 0, 0]
We move all the 0’s to the end of an array, and the rest of the elements retained the order at the start.
*/

public class Solution {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.


        // Using Extra Space 

        // int count = 0;
        // int [] arr = new int[a.length];
        // int j = 0;
        // for(int i = 0; i<a.length;i++){
        //     if(a[i] == 0) count ++;
        //     else{
        //         arr[j] = a[i];
        //         j++;
        //     }
        // }

        // for(int i = 0 ; i<arr.length; i++){
        //     a[i] = arr[i];
        // }

//  Using two pointer approach

        int i = 0; int j = 0;
        for(j = 0 ;j<a.length; j++){
            if(a[j] != 0){
                
                a[i] = a[j];
                i++;
            }
        }
        while(i<a.length) {
            a[i] = 0;
            i++;
        }
        return a;
    }
}
