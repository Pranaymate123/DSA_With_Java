package Array_Package;

import java.util.Scanner;

public class D05_2D_Array {

    public int[][] createMatrix1(int mat[][],int m,int n)
    {
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        return mat;
    }
    public void displayMatrix(int mat[][],int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("\t"+mat[i][j]);
            }
            System.out.println("");
        }
    }
    public int[][] addition(int mat1[][],int mat2[][],int m1,int n1,int m2,int n2)
    {
        int result[][]=null;
        if(m1==m2 && n1==n2)
        {
            result=new int[m1][n1];
            for(int i=0;i<m1;i++)
            {
                for(int j=0;j<n1;j++)
                {
                    result[i][j]=mat1[i][j]+mat2[i][j];
                }
            }

        }
        else
        {
            System.out.println("Addtion Not Possible ");
        }
        return result;
    }
    public int[][] substraction(int mat1[][],int mat2[][],int m1,int n1,int m2,int n2)
    {
        int result[][]=null;
        if(m1==m2 && n1==n2)
        {
            result=new int[m1][n1];
            for(int i=0;i<m1;i++)
            {
                for(int j=0;j<n1;j++)
                {
                    result[i][j]=mat1[i][j]-mat2[i][j];
                }
            }

        }
        else
        {
            System.out.println("Subtraction Not Possible ");
        }
        return result;
    }
    public int [][] multiplication(int mat1[][],int mat2[][],int m1,int n1,int m2,int n2)
    {
        int result[][]=null;
        if(n1==m2)
        {
            result = new int[m1][n2];
            for(int i=0;i<m1;i++)
            {
                for(int j=0;j<n2;j++)
                {
                    for(int k=0;k<n1;k++)
                    {
                        result[i][j]=result[i][j]+(mat1[i][k] * mat2[k][j]);
                    }
                }
            }


        }
        else
        {
            System.out.println("Multiplication Not Possible ");
        }
        return result;
    }
}
