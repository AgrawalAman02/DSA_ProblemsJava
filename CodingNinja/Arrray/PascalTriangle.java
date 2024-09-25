import java.util.*;
public class Solution {

    public static int[] generateRow(int row,int n){
        int ans = 1;
        int []arr = new int[row];
        arr[0] = 1;

        for(int col = 1; col<row;col++){
            ans *= (row-col);
            ans /=col;
            arr[col]= ans;
        }
        return arr;
    }
    public static int[][] pascalTriangle(int N) {
        // Write your code here.
        int [][] arr = new int[N][N];

        for(int i =1 ; i<=N;i++){
            arr[i-1] = generateRow(i,N);
        }
        return arr;
    }
}
