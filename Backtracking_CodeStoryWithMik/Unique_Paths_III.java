package Backtracking_CodeStoryWithMik;

public class Unique_Paths_III {

    int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
    int result=0;
    int nonObstacleCount=0;
    int m,n;
    public int uniquePathsIII(int[][] grid) {
        m=grid.length;
        n=grid[0].length;

        int start_i=-1;
        int start_j=-1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                {
                    nonObstacleCount++;
                }

                if(grid[i][j]==1)
                {
                    start_i=i;
                    start_j=j;
                }
            }
        }
        nonObstacleCount+=1;
        int count=0;
        backTrack(grid,count,start_i,start_j);
        return result;
    }

    public  void backTrack(int [][] grid,int count,int i,int j)
    {
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==-1)
        {
            return;
        }

        if(grid[i][j]==2)
        {
            if(nonObstacleCount==count)
            {
                result++;

            }
            return;
        }

        grid[i][j]=-1;

        for(int[] dir:directions)
        {
            int new_i=i+dir[0];
            int new_j=j+dir[1];

            backTrack(grid,count+1,new_i,new_j);
        }
        grid[i][j]=0;
    }

    public static void main(String[] args) {
        int[][] grid={{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        Unique_Paths_III obj=new Unique_Paths_III();
        System.out.println(obj.uniquePathsIII(grid));
    }
}
