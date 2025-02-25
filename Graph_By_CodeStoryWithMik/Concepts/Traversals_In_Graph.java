package Graph_By_CodeStoryWithMik.Concepts;

import java.util.*;

public class Traversals_In_Graph {
/**
    public static ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        boolean[] visited = new boolean[10001];
        int u = 0;
        for (ArrayList<Integer> list : adj) {
            map.putIfAbsent(u, new ArrayList<>());
            for (Integer v : list) {
                map.get(u).add(v);
            }
            u++;
        }
        ArrayList<Integer> result=new ArrayList<>();
        solve(0,visited,map,result);

        return result;
    }

    public static void solve(int u, boolean[] visited, Map<Integer, ArrayList<Integer>> adj,ArrayList<Integer> result)
    {
        if(visited[u]) return;

        result.add(u);
        visited[u]=true;
        for(Integer v:adj.get(u))
        {
            if(!visited[v])
            {
                solve(v,visited,adj,result);
            }
        }
    }

**/
    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        boolean[] visited = new boolean[10001];
        int u = 0;
        for (ArrayList<Integer> list : adj) {
            map.putIfAbsent(u, new ArrayList<>());
            for (Integer v : list) {
                map.get(u).add(v);
            }
            u++;
        }
        ArrayList<Integer> result=new ArrayList<>();
        Queue<Integer> que=new LinkedList<>();
        que.add(0); 
        visited[0]=true;
        while (!que.isEmpty())
        {
            int vertex=que.poll();
            result.add(vertex);


            for(Integer v:map.get(vertex))
            {
                if(!visited[v])
                {
                    visited[v]=true;
                    que.add(v);
                }

            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding the given elements to the adjacency list
        adj.get(0).addAll(Arrays.asList(2, 3, 1));
        adj.get(1).addAll(Arrays.asList(0));
        adj.get(2).addAll(Arrays.asList(0, 4));
        adj.get(3).addAll(Arrays.asList(0));
        adj.get(4).addAll(Arrays.asList(2));

//        System.out.println(dfsOfGraph(adj));

        System.out.println(bfsOfGraph(0,adj));
    }
}
