package Tree_DataStructure.Pep_Coding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Zig_Zag_Traversal {


    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {


        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag=true;
        while (!queue.isEmpty())
        {

            int levelSize=queue.size();
            TreeNode front=null;
            List<Integer> temp=new ArrayList<>(levelSize);
            for(int i=0;i<levelSize;i++)
            {
                 front=queue.peek();

                if(front.left!=null)
                {
                    queue.add(front.left);
                }
                if(front.right!=null)
                {
                    queue.add(front.right);
                }

                if(flag)
                {
                    temp.add(queue.poll().val);
                }
                else
                {
                    temp.add(0,queue.poll().val);
                }

            }

            flag=!flag;
            result.add(new ArrayList<>(temp));

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

        System.out.println(zigzagLevelOrder(root));
    }
}
