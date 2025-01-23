package Array_Package;

public class Count_Servers_That_Communicate {

    public static int countServers(int[][] grid) {

        int n=grid.length;
        int m=grid[0].length;
        int unReachableServer=0;
        int reachableServers=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    int row=i;
                    int col=j;
                    int countOnes=0;
                    for(int p=0;p<n;p++)
                    {
                        if(grid[p][col]==1) countOnes++;
                    }
                    if(countOnes>1)
                    {
                        reachableServers++;
                        continue;
                    }
                    countOnes=0;
                    for(int p=0;p<m;p++)
                    {
                        if(grid[row][p]==1) countOnes++;
                    }
                    if(countOnes<=1)
                    {
                        unReachableServer++;
                    }
                    else
                    {
                        reachableServers++;
                    }
                }
            }
        }
//        System.out.println("Reachable "+ reachableServers);
//        System.out.println("Un Reachable "+ unReachableServer);
        return reachableServers;
    }


    public static void main(String[] args) {
        int[][] grid={{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}};

        System.out.println(countServers(grid));
    }
}
