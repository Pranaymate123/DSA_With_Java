package Graph_By_CodeStoryWithMik.Concepts;

import java.util.*;

public class Topological_Sorts {


    //// ===================Approach 1 by DFS ===================================
//   public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
//
//       boolean[] visited=new boolean[1001];
//       // Create the adjacency list
//       Map<Integer,ArrayList<Integer>> map =new HashMap<>();
//       Stack<Integer> stk=new Stack<>();
//       int i=0;
//       for(ArrayList<Integer> lst:adj)
//       {
//           map.put(i,lst);
//           i++;
//       }
//
//        for(int j=0;j<map.size();j++)
//        {
//            if(!visited[j])
//                dfs(j,map,visited,stk);
//        }
//        ArrayList<Integer> result=new ArrayList<>();
//        while (!stk.isEmpty())
//        {
//            result.add(stk.pop());
//        }
//
//        return result;
//    }
//
//    public static void dfs(int u,Map<Integer,ArrayList<Integer>> adj,boolean[] visited,Stack<Integer> stk)
//    {
//        if(visited[u]) return;
//
//        visited[u]=true;
//        for(int v:adj.get(u))
//        {
//            if(!visited[v])
//            {
//                dfs(v,adj,visited,stk);
//            }
//        }
//        stk.push(u);
//    }


    //// ========================Approach 2 BY BFS (KAHN'S ALGORITHAM)

    // Function to return list containing vertices in Topological order.
     public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
            Map<Integer,ArrayList<Integer>> map=new HashMap<>();
            int[] inDegree=new int[adj.size()];

            for(int i=0;i<adj.size();i++)
            {
                map.put(i,adj.get(i));


                for(Integer v:adj.get(i))
                {
                    inDegree[v]=inDegree[v]+1;
                }
            }

            ArrayList<Integer> result=new ArrayList<>();
            Queue<Integer> queue=new LinkedList<>();
            for(int j=0;j<inDegree.length;j++)
            {
                if(inDegree[j]==0)
                {
                    queue.add(j);
                }
            }



            while (!queue.isEmpty())
            {
                int u=queue.poll();
                result.add(u);
                for(Integer v:map.get(u))
                {
                    inDegree[v]=inDegree[v]-1;
                    if(inDegree[v]==0)
                    {
                        queue.add(v);
                    }
                }
            }

            return result;
    }
    public static void main(String[] args) {

    }
}
