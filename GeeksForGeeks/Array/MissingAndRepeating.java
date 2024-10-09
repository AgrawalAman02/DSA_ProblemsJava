class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        long Sn = (long)n*(n+1)/2;
        long S2n = (long)n*(n+1)*(2*n+1)/6;
        long S =0, S2 = 0;
        
        for(int i =0 ; i<n;i++){
            S += arr[i];
            S2 += (long)arr[i]*arr[i];
        }
        
        long val1 = S-Sn;
        long val2 = S2 - S2n;
        val2 = val2/val1;
        int x =  (int)(val1+ val2)/2;
        int y = (int)Math.abs((val1-val2)/2);
        
        int []a = new int[]{x,y};
        return a;
    }
}
