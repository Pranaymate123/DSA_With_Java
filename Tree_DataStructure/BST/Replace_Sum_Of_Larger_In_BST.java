package Tree_DataStructure.BST;

public class Replace_Sum_Of_Larger_In_BST {

    int sum=0;
    public  void replace(TreeNode root)
    {
        if(root==null) return;

        replace(root.right);
        int temp=root.val;
        root.val=sum;
        sum+=temp;
        replace(root.left);

    }
    public  void display(TreeNode root)
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

        Replace_Sum_Of_Larger_In_BST obbj=new Replace_Sum_Of_Larger_In_BST();
        obbj.replace(root);

        obbj.display(root);
    }
}
