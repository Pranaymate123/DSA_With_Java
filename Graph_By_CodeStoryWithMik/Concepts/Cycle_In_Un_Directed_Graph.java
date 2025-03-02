package Graph_By_CodeStoryWithMik.Concepts;

import java.util.*;

public class Cycle_In_Un_Directed_Graph {


    // APPROACH 2 :: BY BFS

    static class Pair{
        int node;
        int parent;

        public Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }
    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        boolean[] visited=new boolean[100001];
        int u=0;
        for(ArrayList<Integer> list:adj)
        {
            map.put(u,list);
            u++;
        }

        for(int i=0;i<adj.size();i++)
        {
            if(!visited[i] && bfs(map,i,visited))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean bfs(Map<Integer,ArrayList<Integer>> adj,int u,boolean[] visited)
    {
        Queue<Pair> que=new LinkedList<>();
        que.add(new Pair(u,-1));
        visited[u]=true;
        while (!que.isEmpty())
        {
            Pair p=que.poll();
            for(Integer v:adj.get(p.node))
            {
                if(v==p.parent) continue;

                if(visited[v]) return true;

                visited[v]=true;
                que.add(new Pair(v,p.node));
            }
        }
        return false;
    }


//    Approach 1 : By DFS
/*
    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        boolean[] visited=new boolean[100001];
        int u=0;
        for(ArrayList<Integer> list:adj)
        {
            map.put(u,list);
            u++;
        }

        for(int i=0;i<adj.size();i++)
        {
            if(!visited[i] && dfs(map,i,visited,-1))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean dfs(Map<Integer,ArrayList<Integer>> adj,int u,boolean[] visited,int parent)
    {
        visited[u]=true;

        for(Integer v:adj.get(u))
        {
            if(v==parent) continue;

            if(visited[v]) return true;

            if(dfs(adj,v,visited,u)) return true;
        }

        return false;
    }
*/

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1)));
        adj.add(new ArrayList<>(Arrays.asList(0,2,4)));
        adj.add(new ArrayList<>(Arrays.asList(1,3)));
        adj.add(new ArrayList<>(Arrays.asList(2,4)));
        adj.add(new ArrayList<>(Arrays.asList(1,3)));


        System.out.println(isCycle(adj));

    }
}
