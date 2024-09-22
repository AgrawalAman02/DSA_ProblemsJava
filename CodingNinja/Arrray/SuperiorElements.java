import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        List<Integer> ls = new ArrayList<>();
        int n = a.length;
        int max = a[n-1];
        ls.add(a[n-1]);

        for(int i  = n-2;i>=0;i--){
            if(a[i]>max) 
            {
                ls.add(a[i]);
                max=a[i];
            }
            
        }
        Collections.sort(ls);
        return ls;
    }
}
