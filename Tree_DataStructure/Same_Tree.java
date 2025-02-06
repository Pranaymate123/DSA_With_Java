package Tree_DataStructure;

public class Same_Tree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null) return p==q;  ///When both p and q are null then only return True otherwise if any one null return false;

        boolean left = isSameTree(p.left,q.left);

        boolean right=isSameTree(p.right,q.right);

        return p.val == q.val && left && right;
    }
    public static void main(String[] args) {
        TreeNode p=new TreeNode(1);
        p.left=new TreeNode(2);
        p.right=new TreeNode(3);

        TreeNode q=new TreeNode(1);
        q.left=new TreeNode(2);
        q.right=new TreeNode(3);

        System.out.println(isSameTree(p,q));
    }
}
