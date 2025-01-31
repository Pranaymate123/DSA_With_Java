package Tree_DataStructure;

public class Count_Complete_Tree_Nodes {

    public int countNodes(TreeNode root) {

        if(root==null) return 0;

        int leftH=getLeftNodesCount(root);
        int rightH=getRightNodesCount(root);

        if(leftH==rightH)
        {
            return (int) Math.pow(2,leftH) -1;
        }

        return  countNodes(root.left) + countNodes(root.right) +1;
    }

    private int getLeftNodesCount(TreeNode root) {
        int count=0;
        TreeNode curr=root;
        while (curr!=null)
        {
            count++;
            curr=curr.left;
        }
        return count;
    }

    private int getRightNodesCount(TreeNode root)
    {
        int count=0;
        TreeNode curr=root;
        while (curr!=null)
        {
            count++;
            curr=curr.right;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
