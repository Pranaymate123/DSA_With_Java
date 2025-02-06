package Tree_DataStructure;

public class Is_Symmetric_Binary_Tree {

    public static boolean isSymmetric(TreeNode root) {

        if(root==null) return false;

        return solve(root.left,root.right);
    }

    public static boolean solve(TreeNode leftNode,TreeNode rightNode)
    {
        if(leftNode==null || rightNode==null)  ///When both p and q are null then only return True otherwise if any one null return false;
        {
            return leftNode==rightNode;
        }

        boolean leftAndRight=solve(leftNode.left,rightNode.right);

        boolean rightAndLeft=solve(leftNode.right,rightNode.left);

        return leftNode.val == rightNode.val && leftAndRight && rightAndLeft;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(3);

        System.out.println(isSymmetric(root));

    }
}
