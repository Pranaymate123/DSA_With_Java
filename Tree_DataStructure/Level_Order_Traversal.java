package Tree_DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Level_Order_Traversal {

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
        root.left.right=new TreeNode(37);
        root.left.left=new TreeNode(12);
        root.left.right.left=new TreeNode(30);
        root.left.right.right=new TreeNode(40);

        root.right=new TreeNode(75);
        root.right.left=new TreeNode(62);
        root.right.left.left=new TreeNode(60);

        root.right.left.right=new TreeNode(70);
        root.right.right=new TreeNode(87);

        levelOrderTraversal(root);
    }
}
