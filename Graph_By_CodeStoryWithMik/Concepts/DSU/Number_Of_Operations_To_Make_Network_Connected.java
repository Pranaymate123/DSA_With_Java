package Graph_By_CodeStoryWithMik.Concepts.DSU;

public class Number_Of_Operations_To_Make_Network_Connected {

    public static int find(int i,int[] parent)
    {
        if(parent[i]==i)
        {
            return i;
        }
        return parent[i] = find(parent[i],parent);
    }


    public  static void union(int x,int y,int[] parent,int[] rank)
    {
        int xParent=find(x,parent);
        int yParent=find(y,parent);

        if(xParent==yParent) return;

        if(rank[xParent]>rank[yParent])
        {
            parent[yParent]=xParent;
        } else if (rank[xParent]<rank[yParent]) {
            parent[xParent]=yParent;
        }
        else
        {
            parent[xParent]=yParent;
            rank[yParent]=rank[yParent] + 1;
        }
    }
    public static int makeConnected(int n, int[][] connections) {
        if(n-1 > connections.length)
        {
            return -1;
        }

        int[] parent=new int[n];
        int[] rank=new int[n];
        for(int i=0;i<n;i++)
        {
            parent[i]=i;
        }

        int components=n;
        for(int[] c:connections) {
            int x = c[0];
            int y = c[1];

            int xParent = find(x, parent);
            int yParent = find(y, parent);

            if (xParent != yParent)
            {
                components--;
                union(x,y,parent,rank);
            }
        }

        return components-1;

    }
    public static void main(String[] args) {
        int[][] connections={{0,1},{0,2},{1,2}};

        System.out.println(makeConnected(6,connections));
    }
}
