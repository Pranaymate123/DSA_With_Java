package Graph_By_CodeStoryWithMik.Concepts;

public class Detect_Cycle_By_DSU {


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

    public static boolean isCycle(int V, int[][] edges) {
           // Code here
        // Try this on every edge
        // If nodes have the same parent then there is cycle
        // Else do the union
        //After doing on each edge no two nodes having the same parent means no cycle

        // Directlyy edges are given
        int[] parent=new int[V];
        for(int i=0;i<parent.length;i++)
        {
            parent[i]=i;
        }
        int[] rank=new int[V];
        for(int[] e:edges)
        {
            int x=e[0];
            int y=e[1];
             int xParent=find(x,parent);
             int yParent=find(y,parent);

             if(xParent == yParent)
             {
                 return true;
             }
             else
             {
                 union(x,y,parent,rank);
             }
        }
        return false;
    }
    public static void main(String[] args) {
        int V=4;
        int[][] edges={{0,1},{0,2},{1,2},{2,3}};

        System.out.println(isCycle(V,edges));
    }
}
