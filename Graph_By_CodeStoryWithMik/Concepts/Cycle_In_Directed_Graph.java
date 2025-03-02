package Graph_By_CodeStoryWithMik.Concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cycle_In_Directed_Graph {

    public boolean isCyclic(ArrayList<ArrayList<Integer>> adj) {
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        boolean[] visited=new boolean[100001];
        int u=0;
        for(ArrayList<Integer> list:adj)
        {
            map.put(u,list);
            u++;
        }
        boolean[] inRecursion=new boolean[100001];
        for(int i=0;i<adj.size();i++)
        {
            if(!visited[i] && dfs(map,i,visited,inRecursion) )
            {
                return true;
            }
        }
        return false;
    }

    public boolean dfs(Map<Integer,ArrayList<Integer>> adj,int u,boolean[] visited,boolean[] inRecursion)
    {
        visited[u]=true;
        inRecursion[u]=true;

        for(Integer v:adj.get(u))
        {
            if(!visited[v] && dfs(adj,v,visited,inRecursion))
            {
                return true;
            } else if (inRecursion[v]) {
                return true;
            }
        }

        inRecursion[u]=false;

        return false;
    }
    public static void main(String[] args) {

    }
}


