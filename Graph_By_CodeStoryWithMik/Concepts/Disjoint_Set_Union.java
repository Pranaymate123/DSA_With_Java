package Graph_By_CodeStoryWithMik.Concepts;

public class Disjoint_Set_Union {

    // find
    public int find(int i,int[] parent)
    {
        if(parent[i]==i)
        {
            return i;
        }
        return find(parent[i],parent);
    }

    // union
    public void union(int x, int y, int[] parent)
    {
        int x_parent=find(x,parent);
        int y_parent=find(y,parent);

        if(x_parent != y_parent)
        {
            parent[x_parent]=y_parent;
        }
    }
}
