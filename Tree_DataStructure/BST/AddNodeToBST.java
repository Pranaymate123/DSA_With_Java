package Tree_DataStructure.BST;

public class AddNodeToBST {

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
        root.right.left.right=new TreeNode(70);
        root.right.right=new TreeNode(87);

        display(root);

        System.out.println();
        insertRecursive(root,60);
        display(root);
    }
}
