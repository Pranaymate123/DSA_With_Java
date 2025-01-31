package Tree_DataStructure;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Construct_Binary_Tree_From_PreOrder_And_InOrder_Traversal {

    public  static TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        int[] preIdx={0};
        return solve(preorder,inorder,0,inorder.length-1,preIdx,map);
    }
    public static TreeNode solve(int[] preorder,int[] inorder,int start,int end,int[] preIdx,Map<Integer,Integer> map)
    {
        if(preIdx[0]>=preorder.length) return null;
        if(start>end) return null;

        int rootVal=preorder[preIdx[0]];
        int i=map.get(rootVal);
        preIdx[0]++;
        TreeNode node=new TreeNode(rootVal);

        node.left=solve(preorder,inorder,start,i-1,preIdx,map);

        node.right=solve(preorder,inorder,i+1,end,preIdx,map);

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

        int[] preorder={3,9,20,15,7};
        int[] inorder={9,3,15,20,7};

        TreeNode root=buildTree(preorder,inorder);

        levelOrderTraversal(root);
    }
}
