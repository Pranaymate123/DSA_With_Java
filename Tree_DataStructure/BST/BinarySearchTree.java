package Tree_DataStructure.BST;


public class BinarySearchTree {

    public static void insertIterative(TreeNode root,int target)
    {
        if(root==null)
        {
            root=new TreeNode(target);
            return;
        }


        TreeNode curr=root;
        TreeNode parent=curr;
        while (curr!=null)
        {
            parent=curr;
            if(target<curr.val)
            {
                curr=curr.left;
            }
            else
            {
                curr=curr.right;
            }
        }
        if(parent.val>target)
        {
            parent.left=new TreeNode(target);
        }
        else
        {
            parent.right=new TreeNode(target);
        }

    }

    public static TreeNode insertRecursive(TreeNode root,int target)
    {
        if(root==null)
        {
            return new TreeNode(target);
        }

        if(root.val>target)
        {
            root.left =   insertRecursive(root.left,target);
        }
        else {
           root.right =  insertRecursive(root.right,target);
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
        TreeNode root=new TreeNode(8);

        insertIterative(root,3);
        insertIterative(root,10);
        insertIterative(root,1);
        insertIterative(root,6);
        insertIterative(root,4);
        insertIterative(root,7);
        insertIterative(root,14);
        insertIterative(root,13);
        insertRecursive(root,5);

        inorder(root);
    }
}
