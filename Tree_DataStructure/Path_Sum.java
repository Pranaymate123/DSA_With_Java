package Tree_DataStructure;

public class Path_Sum {

    public static boolean hasPathSum(TreeNode root, int targetSum) {

        return solve(root,0,targetSum);
    }

    public static boolean solve(TreeNode node, int sum, int target)
    {
        if(node==null) return false;

        if(node.left==null && node.right==null)
        {
            sum+=node.val;
            if(sum==target)
            {
                return true;
            }
        }

       boolean left= solve(node.left,sum+node.val,target);
        if(left) return true;
       return solve(node.right,sum+node.val,target);

    }
    public static void main(String[] args) {

        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(4);
        root.left.left=new TreeNode(11);
        root.left.left.left=new TreeNode(7);
        root.left.left.right=new TreeNode(2);

        root.right=new TreeNode(8);
        root.right.left=new TreeNode(13);
        root.right.right=new TreeNode(4);
        root.right.right.left=new TreeNode(5);
        root.right.right.right=new TreeNode(1);

        System.out.println(hasPathSum(root,22));
    }
}
