package Array_Package;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> getSpiralMatrix(int matrix[] [])
    {
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        List<Integer> result=new ArrayList<>();
        while (startRow<=endRow && startCol <=endCol)
        {
            //top boundary
            for(int i=startCol;i<=endCol;i++)
            {
                result.add(matrix[startRow][i]);
            }

            //right boundary
            for(int i=startRow+1;i<=endRow;i++)
            {
                result.add(matrix[i][endCol]);
            }
            //botton part

            for(int j=endCol-1;j>=startCol;j--)
            {
                //if only one lement left and it is already prinnted by top part
                if(startRow==endRow)
                {
                    break;
                }
                result.add(matrix[endRow][j]);
            }

            //left part
            for(int j=endRow-1;j>=startRow+1;j--)
            {
                //if only one lement left and it is already prinnted by top part
                if(startCol==endCol)
                {
                    break;
                }
                result.add(matrix[j][startCol]);
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;

        }
        return result;
    }
    public static int [][] getSpiralMatrix2(int n)
    {
        int num=0;
        int startRow=0;
        int startCol=0;
        int endRow=n-1;
        int endCol=n-1;
        int matrix[][]=new int[n][n];

//        List<Integer> result=new ArrayList<>();
        while (startRow<=endRow && startCol <=endCol && num<=num*num )
        {
            //top boundary
            for(int i=startCol;i<=endCol;i++)
            {

                num++;
                matrix[startRow][i]=num;
            }

            //right boundary
            for(int i=startRow+1;i<=endRow;i++)
            {
                num++;
                matrix[i][endCol]=num;
            }
            //botton part

            for(int j=endCol-1;j>=startCol;j--)
            {
                //if only one lement left and it is already prinnted by top part
                if(startRow==endRow)
                {
                    break;
                }

                num++;
                matrix[endRow][j]=num;
            }

            //left part
            for(int j=endRow-1;j>=startRow+1;j--)
            {
                //if only one lement left and it is already prinnted by top part
                if(startCol==endCol)
                {
                    break;
                }

                num++;
                matrix[j][startCol]=num;
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;

        }
        return matrix;
    }


    public static void main(String[] args) {
//            int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        System.out.println(getSpiralMatrix(matrix));

        int matrix[][]=getSpiralMatrix2(3);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
