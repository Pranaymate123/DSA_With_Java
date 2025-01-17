package Tree.BST;

public class ValidateTheBinaryTree {


    public static boolean isValidBST(TreeNode root) {
          return  validateBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE);

    }

    public static boolean validateBst(TreeNode root,int min,int max)
    {
        if(root==null) return true;

        if(root.val<min || root.val>max)
        {
            return false;
        }
        return validateBst(root.left,min,root.val) && validateBst(root.right,root.val,max);
    }


    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.right.left=new TreeNode(4);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);

        System.out.println(isValidBST(root));


    }
}
