package Graph_By_CodeStoryWithMik.Concepts;

import Sorting.CyclicSort;

import java.util.*;

public class Cycle_In_Directed_Graph {


    /// Approach 1 DFS
//    public boolean isCyclic(ArrayList<ArrayList<Integer>> adj) {
//        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
//        boolean[] visited=new boolean[100001];
//        int u=0;
//        for(ArrayList<Integer> list:adj)
//        {
//            map.put(u,list);
//            u++;
//        }
//        boolean[] inRecursion=new boolean[100001];
//        for(int i=0;i<adj.size();i++)
//        {
//            if(!visited[i] && dfs(map,i,visited,inRecursion) )
//            {
//                return true;
//            }
//        }
//        return false;
//    }

//    public boolean dfs(Map<Integer,ArrayList<Integer>> adj,int u,boolean[] visited,boolean[] inRecursion)
//    {
//        visited[u]=true;
//        inRecursion[u]=true;
//
//        for(Integer v:adj.get(u))
//        {
//            if(!visited[v] && dfs(adj,v,visited,inRecursion))
//            {
//                return true;
//            } else if (inRecursion[v]) {
//                return true;
//            }
//        }
//
//        inRecursion[u]=false;
//
//        return false;
//    }


    // // Approach 2 BFS By using Kahn's Algorithm (Topological Sort)

    public boolean isCyclic(ArrayList<ArrayList<Integer>> adj) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        Queue<Integer> que = new LinkedList<>();
        int V = adj.size();

        int[] inDegree = new int[V];
        for (int i = 0; i < V; i++) {
            map.put(i, map.get(i));
            for (Integer v : map.get(i)) {
                inDegree[v] = inDegree[v] + 1;
            }
        }

        int count = 0;
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                que.add(i);
                count++;
            }
        }

        while (!que.isEmpty())
        {
            int node = que.poll();
            for (Integer v : map.get(node))
            {
                inDegree[v] = inDegree[v] - 1;
                if (inDegree[v] == 0) {
                    que.add(v);
                    count++;
                }
            }

        }
        return count != V;
    }

    public static void printHelloWorld()
    {
        System.out.println("HeLLO Java");
    }

    public static void main(String[] args) {

    }

}


