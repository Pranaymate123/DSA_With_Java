package Tree_DataStructure.BST;

class  TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val=val;
        this.left = null;
        this.right=null;
    }
}

public class Constructed_Binary_Search_Tree {

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
    }
}
