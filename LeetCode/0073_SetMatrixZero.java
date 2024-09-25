class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // int []row = new int[m];
        // int []col = new int[n];

        // for(int i=0;i<m;i++){
        //     for(int j =0;j<n;j++){
        //         if(matrix[i][j]==0){
        //             row[i] = 1;
        //             col[j] =1;
        //         }
        //     }
        // }

        // for(int i=0;i<m;i++){
        //     for(int j =0;j<n;j++){
        //         if(row[i]==1 || col[j]==1){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        // return;

        // O(1) Space Complexity
        int col =1;
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] =0;
                    if(j == 0){
                        col=0;
                    }
                    else{
                        matrix[0][j] =0;
                    }
                    
                }
            }
        }

        for(int i =1;i<m;i++){
            for(int j =1;j<n;j++){
                if(matrix[i][j]!=0)
                {
                    if(matrix[i][0] ==0 || matrix[0][j]==0) matrix[i][j] =0;
                }
            }
        }

        if(matrix[0][0]==0)
        {
            for(int i=matrix[0].length-1;i>=0;i--){
                matrix[0][i] =0;
            }
        }
        if(col == 0){
            for(int i =0;i<matrix.length;i++){
                matrix[i][0]= 0;
            }
        }
        return;
    }
}
