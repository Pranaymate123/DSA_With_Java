package Recursion;

import java.util.Arrays;
import java.util.Map;

public class Unique_Paths {

    public static int helper(int i,int j,int m, int n,int [][] matrix)
    {
        if(i==m-1 && j==n-1) return 1;

        if(i > m-1) return 0;

        if(j>n-1) return 0;

        if(matrix[i][j]!=-1){
            return matrix[i][j];
        }

        int way1= helper(i,j+1,m,n,matrix);
        int way2= helper(i+1,j,m,n,matrix);
        matrix[i][j]=way1+way2;
        return way1+way2;
    }
    public static int uniquePaths(int m, int n) {
        int[][]matrix=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=-1;
            }
        }
        return helper(0,0,m,n,matrix);

    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(50,50));
    }
}
