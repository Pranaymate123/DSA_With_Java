package Daily_Practice;

import java.util.Arrays;

public class Rotate_Image {

    public static void rotate(int[][] matrix) {

        //1) Find the TransForm Of the Matrix
        //2) Reverse Each Row
        int n= matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int[] row : matrix)
        {
            int i=0;
            int j= n-1;

            while (i<=j)
            {
                int temp = row[i];
                row[i] = row[j];
                row[j] = temp;
                i++;
                j--;
            }

//            System.out.println(Arrays.toString(row));
        }


    }

    public static void main(String[] args) {

        int[][] matrix ={{1,2,3} ,{4,5,6} , {7,8,9}};

        rotate(matrix);


    }

}
