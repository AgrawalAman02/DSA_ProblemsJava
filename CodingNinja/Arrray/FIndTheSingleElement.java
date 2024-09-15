import java.util.*;

public class Solution {
    public static int getSingleElement(int []arr){
        // Write your code here.
        // int len = arr.length;
        // int n = (len/2)+1;
        // int twiceSum = n*(n+1);
        // int arrSum=0;
        // for(int i = 0 ; i<len;i++){
        //     arrSum += arr[i];
        // }
        // return twiceSum-arrSum;

        //  above is not working for the case when no.s are not in the range from [1,n]


        // ApproACH 2

        // HashMap<Integer, Integer> map = new HashMap<>();
        // int len = arr.length;
        // for(int i = 0 ; i<len; i++){
        //     if(map.containsKey(arr[i])) map.put(arr[i], 2);
        //     else map.put(arr[i], 1);
        // }
        // // int ans= 0;
        // for (Map.Entry<Integer, Integer> e : map.entrySet()) {
        //     if (e.getValue() == 1) {
        //         return e.getKey();
        //     }
        // }

        // // This line should never be reached if input is valid
        // return -1; 

        // Approach 3 without using the extra space
        // using XOR

        int element= 0;
        for(int i = 0; i<arr.length;i++){
            element ^=arr[i];
        }
        return element;

    }
}
