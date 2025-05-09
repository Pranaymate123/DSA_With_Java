package Graph_By_CodeStoryWithMik.Concepts.DSU;

public class Satisfiability_Of_Equations {

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

        if(rank[xParent]>rank[yParent])
        {
            parent[yParent]=xParent;
        } else if (rank[xParent]<rank[yParent]) {
            parent[xParent]=yParent;
        }
        else
        {
            parent[xParent]=yParent;
            rank[yParent]=rank[yParent]+1;
        }
    }
    public static boolean equationsPossible(String[] equations) {
        int[] parent=new int[26];
        int[] rank=new int[26];

        for(int i=0;i<26;i++)
        {
            parent[i]=i;
        }

        /// First do the union of all equal equations
        for(String s:equations)
        {
            if(s.charAt(1)=='=')
            {
                char first=s.charAt(0);
                char second=s.charAt(3);

                union(first-'a',second-'a',parent,rank);
            }
        }

        for(String s:equations)
        {
            if(s.charAt(1)=='!')
            {
                char first=s.charAt(0);
                char second=s.charAt(3);

                int xParent=find(first-'a',parent);
                int yParent=find(second-'a',parent);

                if(xParent == yParent)
                {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String[] equations={"a==b","b!=a"};
        System.out.println(equationsPossible(equations));

    }
}
