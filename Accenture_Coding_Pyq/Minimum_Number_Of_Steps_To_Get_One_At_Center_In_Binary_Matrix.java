package Accenture_Coding_Pyq;

public class Minimum_Number_Of_Steps_To_Get_One_At_Center_In_Binary_Matrix {
    public static int getMinSteps(int[][] mat)
    {
        int row=0;
        int col=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(mat[i][j]==1)
                {
                    row=i;
                    col=j;
                    break;
                }
            }
        }
        int center=mat.length/2;
        int ans=0;
        ans+=Math.abs(row-center);
        ans+=Math.abs(col-center);
        return ans;
    }
    public static void main(String[] args) {
        int[][] mat={{0,0,0,0,0},{0,0,0,0,1},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        System.out.println(getMinSteps(mat));
    }
}
