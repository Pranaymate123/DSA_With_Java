package Tree_DataStructure;

import java.util.Map;

public class Distribute_Coins_In_Binary_Tree {

    int result=0;
    public int distributeCoins(TreeNode root) {

        solve(root);
        return result;
    }

    public  int solve(TreeNode node)
    {
        if(node==null) return 0;

        int left=solve(node.left);
        int right=solve(node.right);

        result+=Math.abs(left);
        result+= Math.abs(right);

        return left + right + node.val - 1;

    }
    public static void main(String[] args) {
        Distribute_Coins_In_Binary_Tree obj=new Distribute_Coins_In_Binary_Tree();

        TreeNode root=new TreeNode(0);
        root.left=new TreeNode(3);
        root.right=new TreeNode(0);

        System.out.println(obj.distributeCoins(root));
    }
}
