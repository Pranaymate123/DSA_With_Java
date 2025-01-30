package Tree_DataStructure.Pep_Coding;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Construct_Binary_Tree_From_Parent_Array {

    public  static TreeNode createTree(int[] parent) {

        Map<Integer,TreeNode> map=new HashMap<>();
        TreeNode root=null;
        for(int i=0;i<parent.length;i++)
        {
            if(parent[i]==-1)
            {
                root=new TreeNode(i);
                map.put(i,root);
            }
            else
            {
                TreeNode temp=new TreeNode(i);
                map.put(i,temp);
            }
        }

        for(int i=0;i<parent.length;i++)
        {
            if(parent[i]==-1)
            {
               continue;
            }
            else
            {

                TreeNode parentNode=map.get(parent[i]);
                if(parentNode.left==null)
                {
                    parentNode.left=map.get(i);
                }
                else
                {
                    parentNode.right=map.get(i);
                }
            }
        }

        return root;
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
        int[] parent={-1, 0, 0, 1, 1, 3,5};

        TreeNode root=createTree(parent);

        levelOrderTraversal(root);
    }
}
