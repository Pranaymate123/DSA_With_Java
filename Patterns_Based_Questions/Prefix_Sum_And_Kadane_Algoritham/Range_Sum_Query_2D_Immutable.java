package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham;

import java.util.Arrays;

public class Range_Sum_Query_2D_Immutable {

    int[][] pSum;
    public Range_Sum_Query_2D_Immutable (int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] pSum = new int[n][m];

        //Propagate first row
        pSum[0][0] = matrix[0][0];
        for (int j = 1; j < m; j++) {
            pSum[0][j] = pSum[0][j - 1] + matrix[0][j];
        }

        //Propagate first column
        for (int i = 1; i < n; i++) {
            pSum[i][0] = pSum[i - 1][0] + matrix[i][0];
        }

        //for rest
        for (int i = 1; i < n; i++)
        {
            for(int j=1;j<m;j++)
            {
    //                     = ele + top + left - topLeft
                pSum[i][j] = matrix[i][j] + pSum[i-1][j] + pSum[i][j-1] -  pSum[i-1][j-1];
            }
        }

        this.pSum = pSum;


    }

    public  int sumRegion(int row1, int col1, int row2, int col2) {
        int total = pSum[row2][col2];
        int top = row1>0 ? pSum[row1-1][col2] : 0;
        int left = col1 >0 ? pSum[row2][col1-1] : 0;
        int topLeft = (col1 > 0 && row1 >0) ? pSum[row1-1][col1-1] : 0;

        return total - top -left + topLeft;

    }

    public static void main(String[] args) {
        int[][] matrix ={{1,2,3,4} , {5,6,7,8} , {9,10,11,12},{13,14,15,16}};

        Range_Sum_Query_2D_Immutable obj = new Range_Sum_Query_2D_Immutable(matrix);

        System.out.println(obj.sumRegion(2,2,3,3));

    }
}
