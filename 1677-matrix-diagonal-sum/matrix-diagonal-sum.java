class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        // int startRow = 0;
        // int endRow = mat.length - 1;
        // int startCol = 0;
        // int endCol = mat[0].length - 1;

        // while(startRow <= endRow && startCol <= endCol){
        //     sum = mat[startRow][startCol] + mat[startRow][endCol] + mat[endRow][startCol] + mat[endRow][endCol];

        //     startRow++;
        //     endRow--;
        //     startCol++;
        //     endCol--;
        // }


        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(i == j || (i+j == mat.length-1)){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}