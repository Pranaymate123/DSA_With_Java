package Tree.BST;

public class ConstructBstFromPreOrder {

    public static TreeNode bstFromPreorder(int[] preorder) {
        return getbstFromPreOrder(preorder,Integer.MAX_VALUE,new int[]{0});
    }

    public static TreeNode getbstFromPreOrder(int[] preorder, int bound, int[] i)
    {
        if(i[0]==preorder.length || preorder[i[0]] > bound)
            return null;
        TreeNode root=new TreeNode(preorder[i[0]++]);
        root.left=getbstFromPreOrder(preorder,root.val,i);
        root.right=getbstFromPreOrder(preorder,bound,i);
        return root;
    }

    public static void inorder(TreeNode root)
    {
        if(root==null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int [] preorder={8,5,1,7,10,12};
        TreeNode root=bstFromPreorder(preorder);

        inorder(root);

    }
}
