// my first approach

import java.util*;
class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        // HashMap<Integer,Integer> mp = new HashMap<>();
        // for(int i = 0 ; i<n;i++){
        //     mp.put(arr[i], mp.getOrDefault(arr[i],0) +1);
        // }
        
        // for(Entry<Integer,Integer> entry : mp.entrySet()){
        //     if(entry.getValue()>n/2) return entry.getKey(); 
        // }
        // return -1;

        // with O(1) space 
        int element = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i<n;i++){
            if(count ==0){
                element = arr[i];
                count ++;
            }
            else if(arr[i]== element) count++;
            else if(arr[i]!= element) count--;
        }
        return element;
    }
}
