package Tree_DataStructure;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Construct_Binary_Tree_From_PostOrder_And_Inorder_Traversal {


    public static TreeNode buildTree(int[] inorder, int[] postorder) {

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        int[] postIdx={postorder.length-1};
       return solve(inorder,postorder,0,postorder.length-1,postIdx,map);

    }

    public static TreeNode solve(int[] inorder, int[] postorder, int start, int end, int[] postIdx, Map<Integer,Integer> map)
    {


        if(start>end)
        {
            return null;
        }
        if(postIdx[0]<0)
        {
//            System.out.println("Reached at end Called");
            return null;
        }

        int rootVal=postorder[postIdx[0]];
        TreeNode node=new TreeNode(rootVal);
        int i=map.get(rootVal);
        postIdx[0]--;

//        System.out.println("Node is "+rootVal +" || Start -> "+start+" || Index i -> "+ i+ " ||  end  -> "+ end);
        node.right=solve(inorder,postorder,i+1,end,postIdx,map);
        node.left=solve(inorder,postorder,start,i-1,postIdx,map);

        return node;
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
        int[] postorder={9,15,7,20,3};
        int[] inorder={9,3,15,20,7};

       TreeNode root=buildTree(inorder,postorder);

       levelOrderTraversal(root);

    }

}
