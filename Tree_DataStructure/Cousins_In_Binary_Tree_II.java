package Tree_DataStructure;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Cousins_In_Binary_Tree_II {

    public static TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        int levelSum=root.val;

        while (!que.isEmpty())
        {

            int size=que.size();
            int nextLevelSum=0;
            while (size!=0)
            {
                TreeNode curr=que.poll();
                curr.val=levelSum-curr.val;
                int sibLingSum=0;
               sibLingSum+=curr.left==null?0:curr.left.val;
               sibLingSum+=curr.right==null?0:curr.right.val;


                if(curr.left!=null)
                {
                    nextLevelSum+=curr.left.val;
                    curr.left.val=sibLingSum;
                    que.add(curr.left);
                }
                if(curr.right!=null)
                {
                    nextLevelSum+=curr.right.val;
                    curr.right.val=sibLingSum;
                    que.add(curr.right);
                }

                size--;
            }
            levelSum=nextLevelSum;

        }
        return root;
    }

    public static void inorder(TreeNode node)
    {
        if(node==null) return;

        inorder(node.left);
        System.out.print(node.val + "  ");
        inorder(node.right);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(4);
        root.right=new TreeNode(9);

        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(10);

        root.right.right=new TreeNode(7);

        root=replaceValueInTree(root);

        inorder(root);
    }
}
