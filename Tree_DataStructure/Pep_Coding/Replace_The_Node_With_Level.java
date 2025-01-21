package Tree_DataStructure.Pep_Coding;

import java.util.LinkedList;
import java.util.Queue;

public class Replace_The_Node_With_Level {

    public static void replaceNodeWithTheLevel(TreeNode root,int k)
    {
        if(root==null) return;

        root.val=k;

        replaceNodeWithTheLevel(root.left,k+1);
        replaceNodeWithTheLevel(root.right,k+1);
    }
    public static void levelOrderTraversal(TreeNode root)
    {
        Queue<TreeNode> queue=new LinkedList<>();

        queue.add(root);
        TreeNode curr=null;
        while (!queue.isEmpty())
        {
            curr=queue.poll();

            System.out.print(curr.val+"  ");

            if(curr.left!=null)
            {
                queue.add(curr.left);
            }
            if(curr.right!=null)
            {
                queue.add(curr.right);
            }
        }
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

        replaceNodeWithTheLevel(root,0);
        levelOrderTraversal(root);

    }
}
