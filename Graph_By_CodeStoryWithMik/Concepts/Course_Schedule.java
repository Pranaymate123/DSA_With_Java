package Graph_By_CodeStoryWithMik.Concepts;

import java.util.*;

public class Course_Schedule {

//   // Approach 1 By BFS(KAHN's Algorithm)
//    public static boolean canFinish(int numCourses, int[][] prerequisites) {
//        // Convert the prerequisites into the adj
//        Map<Integer, List<Integer>> adj=new HashMap<>();
//        int[] inDegree=new int[numCourses];
//        for(int[] p:prerequisites)
//        {
//            adj.putIfAbsent(p[1],new ArrayList<>());
//            List<Integer> temp=adj.get(p[1]);
//            temp.add(p[0]);
//            inDegree[p[0]]=inDegree[p[0]]+1;
//        }
//        int total=0;
//        Queue<Integer> que=new LinkedList<>();
//        for(int i=0;i<numCourses;i++)
//        {
//            if(inDegree[i]==0)
//            {
//                que.add(i);
//                total++;
//            }
//        }
//
//        while (!que.isEmpty())
//        {
//            int node=que.poll();
//            if(adj.get(node)==null) continue;
//            for(int n:adj.get(node))
//            {
//                inDegree[n]=inDegree[n]-1;
//                if(inDegree[n]==0)
//                {
//                    que.add(n);
//                    total++;
//                }
//            }
//        }
//
//        return total==numCourses;
//    }

    //// Approach 2 BY DFS

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> adj=new HashMap<>();
        for(int[]p: prerequisites)
        {
            int a=p[0];
            int b=p[1];

            adj.putIfAbsent(b,new ArrayList<>());
            adj.putIfAbsent(a,new ArrayList<>());
            List<Integer> temp=adj.get(b);
            temp.add(a);
        }
//        System.out.println(adj.get(0));

        boolean[] inRecursion=new boolean[numCourses+1];
        boolean[] visited=new boolean[numCourses+1];

        boolean isCycle=false;

        for(int i=0;i<numCourses;i++)
        {
            if(!visited[i]&& dfs(i,adj,visited,inRecursion))
            {
               return false; /// That means agar cycle hai toh course complete naho honge
            }
        }

        return true;

    }

    public static boolean dfs(int u,Map<Integer,List<Integer>> adj,boolean[] visited,boolean[] inRecursion)
    {
        visited[u]=true;
        inRecursion[u]=true;
        List<Integer> nbrs=adj.get(u);
//        if(nbrs==null) return false;
        for(Integer v:nbrs) {
            if (!visited[v] && dfs(v, adj, visited, inRecursion))
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
        System.out.println( canFinish(2,new int[][]{{1,0}}));
    }
}
