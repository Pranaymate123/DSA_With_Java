package Tree.BST;


class TreeNode{
    int val;
    TreeNode left,right;

    public TreeNode(int x)
    {
        val=x;
    }
}

public class BST {


    public static TreeNode deleteNode(TreeNode root, int key) {
        TreeNode dummy=root;
        while (root!=null) {
            if (root.val > key) {
                if (root.left != null && root.left.val == key) {
                    root.left = helper(root.left);
                    break;
                } else {
                    root = root.left;
                }
            } else {
                if (root.right != null && root.right.val == key) {
                    root.right = helper(root.right);
                    break;
                } else {
                    root = root.right;
                }
            }
        }

        return dummy;
    }

    public static TreeNode helper(TreeNode root)
    {
        if(root.left==null)
        {
            return root.right;
        }
        if(root.right==null)
        {
            return root.left;
        }
        TreeNode rightChild=root.right;
        TreeNode LeftLastRightChild=findLastRightChild(root.left);
        LeftLastRightChild.right=rightChild;
        return root.left;
    }

    public static TreeNode findLastRightChild(TreeNode root)
    {
        if(root.right==null)
        {
            return root;
        }
        return findLastRightChild(root.right);
    }

    public static   TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode curr=root;
        while (true)
        {
            if(curr.val > val)
            {
                if(curr.left!=null)
                {
                    curr=curr.left;
                }
                else {
                    curr.left=new TreeNode(val);
                    break;
                }
            }
            else
            {
                if(curr.right!=null)
                {
                    curr=curr.right;
                }
                else {
                    curr.right=new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }

    public static void Inorder(TreeNode root)
    {
        if(root==null) return;

        Inorder(root.left);
        System.out.print(root.val+ " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);

        root=insertIntoBST(root,8);

        Inorder(root);


    }
}
