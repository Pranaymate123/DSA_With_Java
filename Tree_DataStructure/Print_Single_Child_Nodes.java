package Tree_DataStructure.Pep_Coding;

public class Print_Single_Child_Nodes {

    public static void printSingleChildNodes(TreeNode root)
    {

        if(root==null) return;
        if(root.left==null && root.right==null)
        {
            return;
        }

        if(root.left!=null && root.right==null)
        {
            System.out.println(root.left.val +"   ");
        }
        if(root.right!=null && root.left==null)
        {
            System.out.println(root.right.val + "  ");
        }

        printSingleChildNodes(root.left);
        printSingleChildNodes(root.right);
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
//        root.right.right=new TreeNode(87);

        printSingleChildNodes(root);
    }
}
