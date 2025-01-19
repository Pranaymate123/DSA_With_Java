package Tree_DataStructure.Pep_Coding;

import java.util.LinkedList;
import java.util.Queue;

public class Left_Cloned_Tree {

    public static void leftClonedTree(TreeNode root)
    {

        if(root==null)
        {
            return;
        }

        TreeNode temp=root.left;
        root.left=new TreeNode(root.val);
        root.left.left=temp;
        leftClonedTree(temp);
        leftClonedTree(root.right);

    }

    public  static void transformBackFromLeftClonedTree(TreeNode root)
    {
        if(root==null)
        {
            return;
        }

        root.left=root.left.left;

        transformBackFromLeftClonedTree(root.left);
        transformBackFromLeftClonedTree(root.right);
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

        TreeNode root=new TreeNode(1);
         root.left=new TreeNode(2);
         root.left.left=new TreeNode(4);
         root.left.right=new TreeNode(5);
         root.right=new TreeNode(3);
         root.right.left=new TreeNode(6);
         root.right.right=new TreeNode(7);

        System.out.println();
        levelOrderTraversal(root);
        System.out.println();

        leftClonedTree(root);

        levelOrderTraversal(root);

        System.out.println();

        transformBackFromLeftClonedTree(root);

        levelOrderTraversal(root);

    }
}
