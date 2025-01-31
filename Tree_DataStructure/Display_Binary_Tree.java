package Tree_DataStructure;

public class Display_Binary_Tree {

    public static void display(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        String str=root.left==null?" . ":root.left.val+"";
        str+=" <- "+root.val+" -> ";
        str+=root.right==null?" . ":root.right.val+"";

        System.out.println(str);
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.right=new TreeNode(5);
        root.right=new TreeNode(3);
        root.right.right=new TreeNode(4);

        display(root);
    }
}
