class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int startRow = 0;
        int endRow = mat.length - 1;
        int startCol = 0;
        int endCol = mat[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            if (startRow == endRow && startCol == endCol) {
                // Single center element (odd dimensions)
                sum += mat[startRow][startCol];
            } else if (startRow == endRow) {
                // One row left
                sum += mat[startRow][startCol] + mat[startRow][endCol];
            } else if (startCol == endCol) {
                // One column left
                sum += mat[startRow][startCol] + mat[endRow][startCol];
            } else {
                // General case: four distinct corners
                sum += mat[startRow][startCol] + mat[startRow][endCol] +
                    mat[endRow][startCol] + mat[endRow][endCol];
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }



        // for(int i=0; i<mat.length; i++){
        //     for(int j=0; j<mat[0].length; j++){
        //         if(i == j || (i+j == mat.length-1)){
        //             sum += mat[i][j];
        //         }
        //     }
        // }
        return sum;
    }
}