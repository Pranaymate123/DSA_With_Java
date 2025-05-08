package Graph_By_CodeStoryWithMik.Concepts;
import  java.util.*;
public class Is_Bipartite_Graph {


//   // Appraoch 1 :: BY DFS
//    public static boolean isBipartite(int[][] graph) {
//        Map<Integer, List<Integer>> adj = new HashMap<>();
//        int n = graph.length;
//        for (int i = 0; i < n; i++) {
//            adj.putIfAbsent(i, new ArrayList<>());
//            for (int j = 0; j < graph[i].length; j++) {
//                adj.get(i).add(graph[i][j]);
//            }
//        }
//
//        //1 --> RED
//        // 0 ----> GREEN
//        //-1 --> Not colured and not visited
//        int[] color = new int[n];
//        Arrays.fill(color, -1);
//
//        for (int i = 0; i < n; i++) {
//            if (color[i] == -1) {
//                if (!dfs(i,adj,color,1)) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//
//    public static boolean dfs(int curr, Map<Integer, List<Integer>> adj, int[] color, int currColor)
//    {
//      color[curr]=currColor;
//
//
//        //adj vertex
//        for(Integer v: adj.getOrDefault(curr,new ArrayList<>()))
//        {
//            if(color[curr]==color[v])
//            {
//                return false;
//            }
//
//            if(color[v]==-1)
//            {
//                int colorV=1-currColor;   // if currColor ==1 the colorV will 0 and vice versa
//                if(!dfs(v,adj,color,colorV))
//                {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }


    ///// APPROACH 2 : BY BFS

    public static boolean isBipartite(int[][] graph) {

        Map<Integer, List<Integer>> adj = new HashMap<>();
        int n = graph.length;
        for (int i = 0; i < n; i++) {
            adj.putIfAbsent(i, new ArrayList<>());
            for (int j = 0; j < graph[i].length; j++) {
                adj.get(i).add(graph[i][j]);
            }
        }
        int[] color=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++)
        {
            if(color[i]==-1)
            {
                if(!bfs(i,adj,color,1))
                {
                    return false;
                }
            }
        }

        return true;

    }

    public  static boolean bfs(int curr,Map<Integer,List<Integer>> adj,int[] color , int currColor)
    {
        Queue<Integer> que=new LinkedList<>();
        que.add(curr);
        color[curr]=currColor;

        while (!que.isEmpty())
        {
            int currVertex=que.poll();
            for(Integer v:adj.getOrDefault(currVertex,new ArrayList<>()))
            {
                if(color[v]==color[currVertex])
                {
                    return false;
                }
                if(color[v]==-1)
                {
                    color[v]=1-color[currVertex];
                    que.add(v);
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[][] graph={{1,2,3},{0,2},{0,1,3},{0,2}};

        System.out.println(isBipartite(graph));
    }
}
