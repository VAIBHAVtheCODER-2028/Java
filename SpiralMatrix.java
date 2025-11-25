//54. Spiral Matrix
//Given an m x n matrix, return all elements of the matrix in spiral order.
/* 1--> 2-->3
   4--> 5   6  
   7<-- 8<--9 */
import java.util.*;
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int rowStart = 0;
        int rowEnd = m - 1;
        int colStart = 0;
        int colEnd = n - 1;

        ArrayList<Integer> arr = new ArrayList<>();

        // repeat the process while rows and columns are still valid
        while (rowStart <= rowEnd && colStart <= colEnd) {

            // traverse from left to right on the top row
            for (int j = colStart; j <= colEnd; j++) {
                arr.add(matrix[rowStart][j]);
            }
            rowStart++;

            // traverse downwards on the rightmost column
            for (int i = rowStart; i <= rowEnd; i++) {
                arr.add(matrix[i][colEnd]);
            }
            colEnd--;

            // traverse from right to left on the bottom row
            if (rowStart <= rowEnd) {
                for (int j = colEnd; j >= colStart; j--) {
                    arr.add(matrix[rowEnd][j]);
                }
                rowEnd--;
            }

            // traverse upwards on the leftmost column
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    arr.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        SpiralMatrix s = new SpiralMatrix();

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(s.spiralOrder(matrix));
    }    
}
