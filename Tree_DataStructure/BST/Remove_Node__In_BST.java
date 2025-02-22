package Tree_DataStructure.BST;

public class Remove_Node__In_BST {

    public static int getMax(TreeNode node)
    {
        if(node.right==null)
        {
            return node.val;
        }
        return getMax(node.right);
    }
    public static TreeNode removeNode(TreeNode root,int target)
    {
        if(root==null) return null;

        if(root.val==target)
        {
            if(root.left!=null && root.right!=null)
            {
                int max=getMax(root.left);
                root.val=max;
                root.left=removeNode(root.left,max);
                return root;
            } else if (root.left!=null) {
                return root.left;
            } else if (root.right!=null) {
                return root.right;
            }
            else
            {
                return null;
            }

        }
        else if(root.val > target)
        {
         root.left = removeNode(root.left,target);
        }
        else
        {
          root.right=  removeNode(root.right,target);
        }
        return root;
    }
    public static void display(TreeNode root)
    {
        if(root==null) return;

        display(root.left);
        System.out.print(root.val + " ");
        display(root.right);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(50);
        root.left=new TreeNode(25);
        root.left.left=new TreeNode(12);
        root.left.right=new TreeNode(37);
        root.left.right.left=new TreeNode(30);
        root.right=new TreeNode(75);
        root.right.left=new TreeNode(62);
        root.right.left.left=new TreeNode(60);
        root.right.left.right=new TreeNode(70);
        root.right.right=new TreeNode(87);

        display(root);

        removeNode(root,75);

        System.out.println();
        display(root);
    }
}
