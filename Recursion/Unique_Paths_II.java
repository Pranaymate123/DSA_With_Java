package Recursion;

public class Unique_Paths_II {

    public static int helper(int i,int j,int m, int n,int [][] matrix,int[][] obstacleGrid)
    {



        if(i > m-1) return 0;

        if(j>n-1) return 0;

        if(obstacleGrid[i][j]==1) {
            matrix[i][j]=0;
        }
        if(matrix[i][j]!=-1){
            return matrix[i][j];
        }
        if(i==m-1 && j==n-1) return 1;



        int way1= helper(i,j+1,m,n,matrix,obstacleGrid);
        int way2= helper(i+1,j,m,n,matrix,obstacleGrid);
        matrix[i][j]=way1+way2;
        return way1+way2;
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][]matrix=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=-1;
            }
        }
        return helper(0,0,m,n,matrix,obstacleGrid);
    }

    public static void main(String[] args) {
//        int[][] obstacleGrid={{0,0,0},{0,1,0},{0,0,0}};
        int[][] obstacleGrid={{0,0},{0,1}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
}
