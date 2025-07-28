package Graph_By_CodeStoryWithMik.Concepts.DSU;

import java.util.HashMap;
import java.util.Map;

public class Count_Un_Reachable_Pairs_Of_Nodes_In_Undirected_Graph {

    public static int find(int i,int[] parent)
    {
        if(parent[i]==i)
        {
            return i;
        }

        return parent[i]=find(parent[i],parent);
    }

    public static void union(int x,int y,int[] parent,int[] rank)
    {
        int xParent=find(x,parent);
        int yParent=find(y,parent);

        if(xParent==yParent) return;

        if(rank[xParent] > rank[yParent])
        {
            parent[yParent]=xParent;
        }
        else if(rank[xParent] < rank[yParent])
        {
            parent[xParent]=yParent;
        }
        else
        {
            parent[xParent]=yParent;
            rank[yParent]=rank[yParent]+1;
        }
    }
    public static long countPairs(int n, int[][] edges) {
        int[] parent=new int[n];
        int[] rank=new int[n];

        for(int i=0;i<n;i++)
        {
            parent[i]=i;
        }

        for(int[] e:edges)
        {
            int x=e[0];
            int y=e[1];

            union(x,y,parent,rank);
        }

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int p=find(i,parent);
            map.put(p,map.getOrDefault(p,0)+1);
        }
        if(map.size()==1) return 0;   /// If there is only one component
        int totalComponents=n;
        long result=0;
        for(Integer key:map.keySet())
        {
            int size=map.get(key);
//            System.out.println(key +"  "+ size);
            result+= (long) size *(totalComponents-size);
            totalComponents=totalComponents-size;
        }

        return result;
    }
    public static void main(String[] args) {
//        int[][] edges={{0,2},{0,5},{2,4},{1,6},{5,4}};
        int[][] edges={{5,0},{1,0},{10,7},{9,8},{7,2},{1,3},{0,2},{8,5},{4,6},{4,2}};

        System.out.println(countPairs(11,edges));
    }
}
