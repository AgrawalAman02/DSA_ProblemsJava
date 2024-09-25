class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int n = matrix.length; // no. of rows
        int m = matrix[0].length; // no. of columns

        int left = 0;
        int right = m-1;
        int top = 0;
        int bottom = n-1;

        List<Integer> arr = new ArrayList<>();

        while(top<=bottom && left<=right){

            for(int i = left ; i<=right;i++){
                arr.add(matrix[top][i]);
            }
            top++;
            for(int i = top ; i<=bottom;i++){
                arr.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    arr.add(matrix[bottom][j]);
                }
                bottom--; // Move the bottom boundary up
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr.add(matrix[i][left]);
                }
                left++; // Move the left boundary right
            }
        }
        return arr;
    }
}
