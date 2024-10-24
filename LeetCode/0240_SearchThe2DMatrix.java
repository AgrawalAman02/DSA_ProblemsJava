class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n  = matrix.length, m = matrix[0].length;
        int  ro = 0, col = m-1;

        while(ro<n && col >= 0){
            if(matrix[ro][col] == target) return true;
            else if(matrix[ro][col] < target) ro++;
            else col--;
        }
        return false;
    }
}
