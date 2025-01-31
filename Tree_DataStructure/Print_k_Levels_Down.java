package Tree_DataStructure;

public class Print_k_Levels_Down {

    public static void printKLevelsDown(TreeNode node,int k)
    {
        if(node==null || k<0) return;

        if(k==0)
        {
            System.out.print(node.val + " " );
        }

        printKLevelsDown(node.left,k-1);

        printKLevelsDown(node.right,k-1);
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

        printKLevelsDown(root,2);
    }
}
