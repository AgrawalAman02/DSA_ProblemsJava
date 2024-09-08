public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        int flag = 0;
        for (int i = a.length-1;i>0; i--){
            if(a[i-1]<=a[i]) flag =1;
            else {
                flag = 0;
                break;
            }
        }
        return flag;
    }
}
