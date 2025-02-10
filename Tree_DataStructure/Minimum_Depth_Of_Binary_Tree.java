package Tree_DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Minimum_Depth_Of_Binary_Tree {

//    int minDepth=Integer.MAX_VALUE;
//    public int minDepth(TreeNode root) {
//        if(root==null) return 0;
//       solve(root,1);
//       return minDepth;
//    }
//
//    public  void solve(TreeNode node,int depth)
//    {
//        if(node==null) return;
//        if(node.left==null && node.right==null)
//        {
//            minDepth=Math.min(minDepth,depth);
//        }
//        solve(node.left ,depth+1);
//        solve(node.right,depth+1);
//    }


    //// BFS Approach

    public int minDepth(TreeNode root) {

        if(root==null) return 0;
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        int level=1;
        while (!que.isEmpty())
        {
            int size=que.size();
            while (size!=0)
            {
                TreeNode curr=que.poll();
                size--;
                if(curr.left!=null)
                {
                    que.add(curr.left);
                }
                if(curr.right!=null)
                {
                    que.add(curr.right);
                }
                if(curr.left==null && curr.right==null)
                {
                    return level;
                }
            }
            level++;
        }
        return level;
    }

    public static void main(String[] args) {


    }
}
