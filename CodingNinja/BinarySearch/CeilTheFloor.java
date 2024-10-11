import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
      int lo = 0, hi = n-1;
      int floor = -1, ceil =-1;

      while(lo<= hi){
        int mid = lo + (hi-lo)/2;
        if(a[mid] == x) return new int[]{a[mid],a[mid]};
        if(a[mid]< x){
          floor =a[mid];
          lo = mid+1;
        }
        if(a[mid]> x){
          ceil = a[mid];
          hi = mid-1;
        }
      }

      return new int[]{floor,ceil};
    }
    
}
