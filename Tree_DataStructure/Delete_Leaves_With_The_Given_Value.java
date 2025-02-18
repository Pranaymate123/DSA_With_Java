package Tree_DataStructure;

public class Delete_Leaves_With_The_Given_Value {

    public static TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root==null) return null;


        root.left=removeLeafNodes(root.left,target);
        root.right=removeLeafNodes(root.right,target);

        if(root.left==null && root.right==null && root.val==target)
        {
            return null;
        }
        return root;
    }

    public static void inorder(TreeNode root)
    {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val + "  ");
        inorder(root.right);
    }
    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(2);
        root.right.right=new TreeNode(4);

       root=removeLeafNodes(root,2);

       inorder(root);

    }
}
