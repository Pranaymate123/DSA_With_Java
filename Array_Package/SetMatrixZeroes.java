package Array_Package;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {

    public static void setZeroes(int[][] matrix) {
        Set<Integer> zero_rows=new HashSet<>();
        Set<Integer> zero_cols=new HashSet<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    zero_rows.add(i);
                    zero_cols.add(j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if (zero_rows.contains(i) || zero_cols.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
        }
        display(matrix);

    }

    public static void display(int [][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int [][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
    }
}
