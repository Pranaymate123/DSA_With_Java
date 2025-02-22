package Tree_DataStructure;

public class Recover_Tree_From_Pre_Order_Traversal {

    int n;
    public TreeNode recoverFromPreorder(String traversal) {
        n=traversal.length();
        int[] index={0};
        return solve(index,0,traversal);
    }

    public TreeNode solve(int[] index,int depth,String traversal)
    {
        if(index[0]>=n) return null;

        int j=index[0];
        while (j<n && traversal.charAt(j)=='-')
        {
            j++;
        }
        int dash=j-index[0];

        if(dash!=depth)
        {
            return null;
        }
        index[0]=j;

        int num=0;
        while (index[0]<n && Character.isDigit(traversal.charAt(index[0])))
        {
            num=num*10 + traversal.charAt(index[0])-'0';
            index[0]=index[0]+1;
        }
        TreeNode root=new TreeNode(num);
        root.left=solve(index,depth+1,traversal);
        root.right=solve(index,depth+1,traversal);

        return root;
    }
    public static void main(String[] args) {

    }
}
