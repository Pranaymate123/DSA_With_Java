package Tree;

public class CountNodesInCompleteTree {

    public static int countNodes(TreeNode root)
    {
        if(root==null) return 0;

        int leftH=getLeftHeight(root);
        int rightH=getRightHeight(root);

        if(leftH==rightH)
        {
            return ((int)Math.pow(2,leftH)  -1 );
        }
        else
            return (countNodes(root.left) + countNodes(root.right)) +1;
    }

    public static int getLeftHeight(TreeNode root)
    {
        TreeNode curr=root;
        int cnt=0;
        while (curr!=null)
        {
            cnt++;
            curr=curr.left;
        }
        return cnt;
    }
    public static int getRightHeight(TreeNode root)
    {
        TreeNode curr=root;
        int cnt=0;
        while (curr!=null)
        {
            cnt++;
            curr=curr.right;
        }
        return cnt;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(5);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(6);

        System.out.println(countNodes(root));
    }
}
