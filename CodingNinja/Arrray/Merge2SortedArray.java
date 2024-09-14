import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        // //Write your code here
        // int i = 0 ;
        // int j  = 0;
        // ArrayList<Integer> arr = new ArrayList<>();
        // int n1  = a.length;
        // int n2 = b.length;
        // while(i<n1 && j<n2){
        //     if(a[i]<= b[j]){
        //         if(!arr.contains(a[i])){
        //          arr.add(a[i]);
        //          i++;
        //         }else i++;
        //     }else{
        //         if(!arr.contains(b[j])) {
        //             arr.add(b[j]);
        //             j++;
        //         }
        //         else j++;
        //     }
            
        // }
        // while(i<n1){
        //  if(!arr.contains(a[i])){
        //         arr.add(a[i]);
        //         i++;
        //     }else i++;
        // }
        // while(j<n2){
        //    if(!arr.contains(b[j])) {
        //         arr.add(b[j]);
        //         j++;
        //     }
        //     else j++;
        // }
        // return arr;

// the above solution is solely thought by me :)
// above solution is correct  but it is not too efficient as this arr.contains take too much of the time 


        // Set<Integer> uniqueElements = new HashSet<>();

        // for (int num : a) {
        //     uniqueElements.add(num);
        // }
        // for (int num : b) {
        //     uniqueElements.add(num);
        // }

        // // Convert to ArrayList
        // List<Integer> result = new ArrayList<>(uniqueElements);
        
        // // Sort the list to ensure sorted output
        // Collections.sort(result);

        // return result;
//  10/11 passed

       

    //    Now i m going to use the same two pointer approach that i used above but inspite of the arr.contains , i will use
    //    the benefit of array being the sorted so i track the last element i had added which should not be dded agian

    int n = a.length, m = b.length;
    int i  =0, j=0;
    int last = Integer.MIN_VALUE;
    ArrayList<Integer> arr = new ArrayList<>();
    while(i<n && j < m){
        if(a[i]<=b[j]){
            if(last != a[i]) {
                arr.add(a[i]);
                last = a[i];
            }
            i++;
        }else{
            if(last != b[j]){
             arr.add(b[j]);
             last = b[j];
             }
            j++;
        }
    }
    while(i<n){
        
            if(last != a[i]) {
                arr.add(a[i]);
                last = a[i];
            }
            i++;
        
    }
    while(j<m){
        if(last!= b[j]){
            arr.add(b[j]);
            last = b[j];
        } 
            j++;
    }
    return arr;
    }

    // yeah 11/11 passed with optimality;;;;;;
}
