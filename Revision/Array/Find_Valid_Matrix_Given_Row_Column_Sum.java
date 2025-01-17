package Revision.Array;

import java.util.Arrays;

public class Find_Valid_Matrix_Given_Row_Column_Sum {

    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] matrix=new int[rowSum.length][colSum.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j] = Math.min(rowSum[i],colSum[j]);

                rowSum[i]=rowSum[i]-matrix[i][j];

                colSum[j]=colSum[j]-matrix[i][j];

            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[] rowSum={5,7,10};
        int[] colSum={8,6,8};
      int[][] mat= restoreMatrix(rowSum,colSum);

      for(int[] row : mat)
      {
          System.out.println(Arrays.toString(row));
      }
    }
}
