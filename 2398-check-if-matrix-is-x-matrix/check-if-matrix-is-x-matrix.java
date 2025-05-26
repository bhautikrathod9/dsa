class Solution {
    public boolean checkXMatrix(int[][] grid) {
        boolean flag = true;

        // for(int i=0; i<grid.length; i++){
        //     if((grid[i][i] > 0) && (grid[i][grid.length-i-1] > 0)){
        //         return flag;
        //     }
        // }

        int rows = grid.length;
        int cols = grid[0].length;
        int totalElements = rows*cols;

        for(int i=0; i<totalElements; i++){
            int row = i / cols;
            int col = i % cols;

            if(row == col || (row+col == grid.length-1)){
                if(grid[row][col] <= 0){
                    flag = false;
                    break;
                }
            }else if(grid[row][col] != 0){
                flag = false;
                break;
            }
        }

        return flag;
    }
}