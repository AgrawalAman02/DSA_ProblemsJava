//User function Template for Java

class Solution
{
    
    public int power(long mid, int n, int m)
    {
        long ans = 1;
        for(int i = 1; i<= n; i++)
        {
            ans *= mid;
            if(ans> m) return 2;
        }
        if(ans == m) return 1;
        return 0;
    }
    
    public int NthRoot(int n, int m)
    {
        // code here
        
        int lo = 1, hi = m;
        
        while(lo<= hi)
        {
            int mid = lo + (hi-lo)/2;
            int midN = power(mid, n,m);
            
            if(midN == 1) return mid;
            else if(midN == 2) hi = mid-1;
            else lo = mid+1;
        }
        return -1;
        
    }
}
