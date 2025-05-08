package Graph_By_CodeStoryWithMik.Concepts;
import  java.util.*;
public class Number_Of_Provinces {
    public int findCircleNum(int[][] isConnected) {
        Map<Integer,List<Integer>> adj=new HashMap<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++)
        {
            adj.put(i,new ArrayList<>());
            List<Integer> temp=adj.get(i);
            for(int j=0;j<n;j++)
            {
                if(i!=j && isConnected[i][j]==1)
                    temp.add(j);
            }
        }

        boolean[] visited=new boolean[n+1];
        int result=0;
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                visited[i]=true;
                dfs(i,adj,visited);
                result++;
            }
        }
        return result;
    }

    public void dfs(int u,Map<Integer,List<Integer>> adj,boolean[] visited)
    {
        List<Integer> nbrs=adj.get(u);
        for(int n:nbrs)
        {
            if(!visited[n])
            {
                visited[n]=true;
                dfs(n,adj,visited);
            }
        }
    }
}
