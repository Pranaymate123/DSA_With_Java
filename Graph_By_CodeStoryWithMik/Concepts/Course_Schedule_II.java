package Graph_By_CodeStoryWithMik.Concepts;

import java.util.*;

public class Course_Schedule_II {


    //// Approach I : BY BFS(KAHN's ALGORITHM)
//    public int[] findOrder(int numCourses, int[][] prerequisites) {
//
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
//        for(int i=0;i<inDegree.length;i++)
//        {
//            if(inDegree[i]==0)
//            {
//                que.add(i);
//                total++;
//            }
//        }
//        int[] result=new int[numCourses];
//        int i=0;
//        while (!que.isEmpty())
//        {
//            int node=que.peek();
//            que.poll();
//            result[i]=node;
//            i++;
//            if(adj.get(node)==null) continue;
//            for(Integer n:adj.get(node))
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
//        return  total==numCourses ? result : new int[]{};
//    }


    private boolean hasCycle = false;

    private void DFS(Map<Integer, List<Integer>> adj, int u, boolean[] visited, Deque<Integer> stack, boolean[] inRecursion) {
        visited[u] = true;
        inRecursion[u] = true;

        for (int v : adj.getOrDefault(u, new ArrayList<>())) {
            if (inRecursion[v]) {
                hasCycle = true;
                return;
            }

            if (!visited[v]) {
                DFS(adj, v, visited, stack, inRecursion);
            }
        }

        stack.push(u);
        inRecursion[u] = false;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        boolean[] visited = new boolean[numCourses];
        boolean[] inRecursion = new boolean[numCourses];
        hasCycle = false;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int[] pair : prerequisites) {
            int a = pair[0];
            int b = pair[1];
            adj.computeIfAbsent(b, k -> new ArrayList<>()).add(a); // b --> a
        }

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                DFS(adj, i, visited, stack, inRecursion);
            }
        }

        if (hasCycle) return new int[0];

        int[] result = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            result[index++] = stack.pop();
        }

        return result;
    }
}
