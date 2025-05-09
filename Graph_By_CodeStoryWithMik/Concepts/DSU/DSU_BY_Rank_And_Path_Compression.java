package Graph_By_CodeStoryWithMik.Concepts.DSU;

public class DSU_BY_Rank_And_Path_Compression {

    public int find(int i,int[] parent)
    {
        if(parent[i]==i)
        {
            return i;
        }

        return parent[i]=find(parent[i],parent);
    }

    public void union(int x,int y,int[] parent,int[] rank)
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
    public static void main(String[] args) {

    }
}
