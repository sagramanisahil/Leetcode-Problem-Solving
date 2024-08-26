class SetMatrixZeroes{
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        boolean[] rowZeros = new boolean[row];
        boolean[] colZeros = new boolean[col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j]==0){
                    rowZeros[i] = true;
                    colZeros[j] = true;
                }
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(rowZeros[i] || colZeros[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}