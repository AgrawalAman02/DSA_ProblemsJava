class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int rlo = 0, rhi = n-1;
        while(rlo<= rhi){
            int rmid = rlo + (rhi-rlo)/2;
            if(matrix[rmid][0] == target) return true;
            else if(matrix[rmid][0] > target) rhi = rmid -1;
            else if(matrix[rmid][m-1] < target) rlo = rmid+1;
            else{
                int clo = 0,chi = m-1;
                while(clo<=chi){
                    int cmid = clo + (chi-clo)/2;
                    if(matrix[rmid][cmid] == target) return true;
                    else if(matrix[rmid][cmid]> target) chi  = cmid-1;
                    else {
                        clo = cmid +1;
                    }
                }
                return false;
            }
            
        }
        return false;
    }
}
