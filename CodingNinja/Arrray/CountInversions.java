import java.util.*;
public class Solution {
    static int cnt = 0;

    public static void merge(int[] arr, int lo, int mid, int hi){
        
        int i = lo, j =mid +1;
        List<Integer> temp = new ArrayList<>();
        

        while(i<=mid && j<=hi){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                cnt+=mid-i +1;
                j++;
            }
        }
        while(i<= mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<= hi){
            temp.add(arr[j]);
            j++;
        }

        for( i = lo; i<=hi;i++){
            arr[i] = temp.get(i-lo);
        }

    }

    public static void mergeSort(int[] arr, int lo, int hi){
        if(lo>=hi) return;
        else{
            int mid = lo + (hi-lo)/2;
            mergeSort(arr, lo, mid);
            mergeSort(arr, mid+1, hi);
            merge(arr,lo,mid,hi);
        }
    }
    public static int numberOfInversions(int []a, int n) {
        // Write your code here.
        mergeSort(a,0,n-1);
        return cnt;
    }
}
