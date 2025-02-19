package Tree_DataStructure;

public class LCA_Of_Binary_Tree {
    public static TreeNode lowestCommonAncestor(TreeNode root, int src,int dest ) {

        if(root==null) return null;
        if(root.val == src || root.val == dest)
        {
            return root;
        }
        TreeNode leftFind=lowestCommonAncestor(root.left,src,dest);
        TreeNode rightFind=lowestCommonAncestor(root.right,src,dest);

        if(leftFind!=null && rightFind!=null)
        {
            return root;
        }

        return leftFind!=null ? leftFind:rightFind;
    }
    public static void main(String[] args) {

        TreeNode root=new TreeNode(50);
        root.left=new TreeNode(25);
        root.left.left=new TreeNode(12);
        root.left.right=new TreeNode(37);
        root.left.right.left=new TreeNode(30);

        root.right=new TreeNode(75);
        root.right.left=new TreeNode(62);
        root.right.left.right=new TreeNode(70);
        root.right.right=new TreeNode(87);

        System.out.println(lowestCommonAncestor(root, 30,70).val);
    }
}
