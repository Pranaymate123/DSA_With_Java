package Backtracking_CodeStoryWithMik;

public class Path_With_Maximum_Gold {

    int[][] directions={{0,-1},{0,1},{-1,0},{1,0}};
    int result=Integer.MIN_VALUE;

    int m,n;
    public int getMaximumGold(int[][] grid) {

        m=grid.length;
        n=grid[0].length;

        int maxGold=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]!=0)
                {
                    maxGold=Math.max(maxGold,backTrack(grid,i,j));
                }
            }
        }

        return maxGold;
    }

    public int backTrack(int[][] grid,int i,int j)
    {
            if(i<0 || j<0 || i>=m || j >=n  || grid[i][j]==0)
        {
           return 0;
        }
        int maxGold=0;
        int temp=grid[i][j];
        grid[i][j]=0;

        for(int[] dir:directions)
        {
            int new_i=i+dir[0];
            int new_j=j+dir[1];
            maxGold=Math.max(maxGold,backTrack(grid,new_i,new_j));
        }

        grid[i][j]=temp;

        return temp+maxGold;
    }


    public static void main(String[] args) {
        int[][] grid={{0,6,0},{5,8,7},{0,9,0}};

        Path_With_Maximum_Gold obj=new Path_With_Maximum_Gold();
        System.out.println(obj.getMaximumGold(grid));
    }
}
