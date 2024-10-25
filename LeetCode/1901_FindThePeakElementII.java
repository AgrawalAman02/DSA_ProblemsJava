class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n  = mat.length;
        int m = mat[0].length;

        int lo = 0;
        int hi = m-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int max = Integer.MIN_VALUE;
            int idx = -1;
            for(int i = 0;i<=n-1;i++){
                if(mat[i][mid]>max){
                    max = mat[i][mid];
                    idx = i;
                }
            }

            int left  = mid-1>=0 ? mat[idx][mid-1] : -1;
            int right = mid+1 <m ? mat[idx][mid+1] : -1;

            if(max>left && max> right) return new int[]{idx,mid};
            else if(max < right) lo = mid+1;
            else hi = mid-1;
        }
        return new int[]{-1,-1};
    }
}
