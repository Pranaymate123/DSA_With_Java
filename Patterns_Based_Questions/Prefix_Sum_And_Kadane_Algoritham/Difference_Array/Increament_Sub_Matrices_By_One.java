package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Difference_Array;

import java.util.Arrays;

public class Increament_Sub_Matrices_By_One {

    public static int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] matrix = new int[n][n];

        for(int[] q: queries)
        {
            int r1 = q[0];
            int c1= q[1];
            int r2 = q[2];
            int c2 = q[3];

            for(int i=r1;i<=r2;i++)
            {
                matrix[i][c1]+=1;
                if(c2+1<n)
                {
                    matrix[i][c2+1]-=1;
                }
            }

        }
        //cum sum row wise
        int cSum=0;
       for(int[] row:matrix)
       {
           for(int i=1;i<n;i++)
           {
               row[i]+=row[i-1];
           }
       }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] queries = {{1,1,2,2},{0,0,1,1}};
        int n =3;

        int[][] ans = rangeAddQueries(n,queries);

        System.out.println("------------");
        display(ans);

    }

    public static void display(int[][] mat)
    {
        for(int[] m:mat)
        {
            System.out.println(Arrays.toString(m));
        }
    }
}
