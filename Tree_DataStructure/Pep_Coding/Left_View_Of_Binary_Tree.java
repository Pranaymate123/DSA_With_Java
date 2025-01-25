package Tree_DataStructure.Pep_Coding;

import java.util.*;

public class Left_View_Of_Binary_Tree {

    public  static ArrayList<Integer> leftView(TreeNode root) {
        // code here
        Queue<TreeNode> que=new LinkedList<>();
        ArrayList<Integer> result=new ArrayList<>();
        que.add(root);
        while (!que.isEmpty())
        {
            TreeNode node=que.peek();
            int size=que.size();
            node = que.poll();
            result.add(node.val);
            if(node.left!=null)
            {
                que.add(node.left);
            }
            if(node.right!=null)
            {
                que.add(node.right);
            }
            for(int i=1;i<size;i++)
            {
                TreeNode temp=que.poll();
                if(temp.left!=null)
                {
                    que.add(temp.left);
                }
                if(temp.right!=null)
                {
                    que.add(temp.right);
                }
            }


        }

        return result;
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

        System.out.println(leftView(root));
    }
}
