import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int diff = 0;
        int min = Integer.MAX_VALUE;
        int n = prices.size();
        

        for(int i = 0;i<n;i++){
            int p = prices.get(i);
            if(p<min){
                min= p;
                
            }
            if(p-min>diff) diff = p-min;
        }
        return diff;
    }
}
