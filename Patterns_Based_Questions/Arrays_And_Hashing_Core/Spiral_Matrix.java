package Patterns_Based_Questions.Arrays_And_Hashing_Core;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {


    public static List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int top =0;
        int down = n-1;
        int left =0;
        int right = m-1;

        int dir=0;
        List<Integer> result = new ArrayList<>();
        while (result.size() < (m*n)) {
            //--------> 1st direction
            //top will be constant as row and columns will change from i=left --> right

            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
            }

            /// now thw direction 2 in which right will be constant as column and row will chnage from i= top ---> down
            if (dir == 1) {

                for (int i = top; i <= down; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            }


            //Now direction 3 down will be constant as row  and column change from i= right to left

            if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[down][i]);
                }
                down--;
            }

            //Now the forth direction in which left will cinstant as column and the row chnages from i= down to top
            if (dir == 3)
            {
                for(int i=down;i>=top;i--)
                {
                    result.add(matrix[i][left]);
                }
                left++;
            }

            dir=(dir+1) % 4;
        }
        return result;
    }
    public static void main(String[] args) {

        int[][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};


        System.out.println(spiralOrder(matrix));

    }
}
