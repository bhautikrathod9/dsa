class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> li = new ArrayList<>();
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol){
            // top row
            for(int i = startCol; i <= endCol; i++){
                li.add(matrix[startRow][i]);
            }

            // right column
            for(int j = startRow + 1; j <= endRow; j++){
                li.add(matrix[j][endCol]);
            }

            // bottom row
            if(startRow < endRow) {
                for(int i = endCol - 1; i >= startCol; i--){
                    li.add(matrix[endRow][i]);
                }
            }

            // left column
            if(startCol < endCol) {
                for(int j = endRow - 1; j > startRow; j--){
                    li.add(matrix[j][startCol]);
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return li;
    }
}