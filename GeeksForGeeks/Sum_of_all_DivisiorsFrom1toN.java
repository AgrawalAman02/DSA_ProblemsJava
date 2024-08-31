
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
            Solution ob = new Solution();
            long ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

/* //my approach which gave tle for 4 cases out of 1115 
class Solution{
    
    static long sumOfFactors(int N){
        long sum = 0;
        for(int i = 1 ; (i*i)<=N; i++){
            if(N%i == 0) {
                if(i == N/i) sum +=(long)i;
                else
                {sum = sum +(long)i+ (long)(N/i);}
            }
        }
        return sum;
    }
    
    static long sumOfDivisors(int N){
        // code here
        long result = 0 ;
        for(int i = 1; i<=N; i++){
            result += sumOfFactors(i);
        }
        return result;
    }
}
*/

/* optimal approach 
Divisor i contributes to the sum of divisors for all multiples of i (i.e., i, 2*i, 3*i, ..., k*i where k*i <= N).
So, for each i from 1 to N, you can add i to all its multiples up to N. This approach has a time complexity of O(N), 
which is much more efficient.

For each i from 1 to N, i is a divisor of every multiple of i up to N.
N / i gives the number of multiples of i within the range [1, N].
Thus, the sum of divisors is the sum of i multiplied by how many times i appears as a divor in the range.

*/

class Solution{
    
    static long sumOfDivisors(int N){
        // code here
        long result = 0 ;
        for (int i= 1; i<=N; i++){
            result += (N/i) *i;   // N / i gives the number of multiples of i within the range [1, N].
        }
        return result;
    }
}
