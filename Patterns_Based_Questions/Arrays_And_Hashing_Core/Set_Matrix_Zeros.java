package Patterns_Based_Questions.Arrays_And_Hashing_Core;

import java.util.Arrays;

public class Set_Matrix_Zeros {

    public static void setZeroes(int[][] matrix) {
        int[] zeroRow = new int[matrix.length];
        int[] zeroCol = new int[matrix[0].length];
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    zeroRow[i]=1;
                    zeroCol[j]=1;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(zeroRow[i]==1 || zeroCol[j]==1)
                {
                    matrix[i][j]=0;
                }
            }
        }

//        for(int[] row:matrix)
//        {
//            System.out.println(Arrays.toString(row));
//        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

  setZeroes(matrix);
    }
}
