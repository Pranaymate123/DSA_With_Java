package Tree_DataStructure;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Find_The_Bottom_Left_Tree_Value {


    //// Approach 1 : dfs
//    int result=0;
//    int maxLevel=-1;
//    public  int findBottomLeftValue(TreeNode root) {
//
//        solve(root,0);
//        return result;
//    }
//
//    public  void solve(TreeNode node, int level)
//    {
//        if(node==null)
//        {
//            return;
//        }
//        if(level>maxLevel)
//        {
//            maxLevel=level;
//            result=node.val;
//        }
//
//        solve(node.left,level+1);
//        solve(node.right,level+1);
//    }

    //// Approach 2 BFS
    // in normal Bfs the rightmost node at the end of traversal so to get leftmost first go to right then left

    public int findBottomLeftValue(TreeNode root) {

        int result=-1;
        Queue<TreeNode> que=new LinkedList<>();

        que.add(root);
        while (!que.isEmpty())
        {
            TreeNode curr=que.poll();
            result=curr.val;
            if(curr.right!=null)
            {
                que.add(curr.right);
            }
            if(curr.left!=null)
            {
                que.add(curr.left);
            }

        }
        return result;
    }

    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.left.left = new TreeNode(7);
        root.right.right = new TreeNode(6);

        Find_The_Bottom_Left_Tree_Value obj=new Find_The_Bottom_Left_Tree_Value();
        System.out.println(obj.findBottomLeftValue(root));
    }
}
