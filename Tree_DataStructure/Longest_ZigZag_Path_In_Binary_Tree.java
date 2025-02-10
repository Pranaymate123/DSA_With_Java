package Tree_DataStructure;

public class Longest_ZigZag_Path_In_Binary_Tree {

    int maxPath=0;
    public int longestZigZag(TreeNode root) {
         solve(root,0,0);
         return maxPath;
    }

    public void solve(TreeNode node,int left,int right)
    {
        if(node==null) return;
        maxPath=Math.max(maxPath,Math.max(left,right));

        solve(node.left,right+1,0);
        solve(node.right,0,left+1);
    }
    public static void main(String[] args) {

    }
}
