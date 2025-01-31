package Tree_DataStructure;

class  TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.val = data;
        left=null;
        right=null;

    }

}

public class Traversal_Techniques {


    public  void inOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }

        inOrder(root.left);
        System.out.print(root.val+ "  ");
        inOrder(root.right);
    }

    public  void preOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }


        System.out.print(root.val+ "  ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public  void postOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+ "  ");

    }


    public static void main(String[] args) {
        TreeNode root=new TreeNode(50);
        root.left=new TreeNode(40);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(20);
        root.left.right=new TreeNode(10);

        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(100);

        Traversal_Techniques obj=new Traversal_Techniques();

        System.out.println("InOrder Traversal ");
        obj.inOrder(root);

        System.out.println();
        System.out.println("PreOrder Traversal");
        obj.preOrder(root);

        System.out.println();
        System.out.println("PostOrder Traversal ");
        obj.postOrder(root);
    }

}
