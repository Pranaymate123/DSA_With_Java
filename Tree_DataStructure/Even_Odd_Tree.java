package Tree_DataStructure;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.RecursiveTask;

public class Even_Odd_Tree {


    //// Appraoch 1 : BFS solution
//    public boolean isEvenOddTree(TreeNode root) {
//
//        Queue<TreeNode> que=new LinkedList<>();
//        que.add(root);
//        int level=0;
//
//        while (!que.isEmpty())
//        {
//            int size=que.size();
//            if(level % 2==0)
//            {
//                int prev=Integer.MIN_VALUE;
//               while (size!=0)
//               {
//                   TreeNode curr=que.poll();
//                   if(curr.val % 2==0) return false;
//                   if(curr.val <= prev) return false;
//                   prev=curr.val;
//
//                   if(curr.left!=null){
//                       que.add(curr.left);
//                   }
//                   if(curr.right!=null)
//                   {
//                       que.add(curr.right);
//                   }
//                   size--;
//               }
//            }
//            else {
//                int prev=Integer.MAX_VALUE;
//                while (size!=0)
//                {
//                    TreeNode curr=que.poll();
//                    if(curr.val % 2==1) return false;
//                    if(curr.val >= prev) return false;
//                    prev=curr.val;
//
//                    if(curr.left!=null){
//                        que.add(curr.left);
//                    }
//                    if(curr.right!=null)
//                    {
//                        que.add(curr.right);
//                    }
//                    size--;
//                }
//            }
//            level++;
//        }
//
//        return true;
//    }

    //// Approach 2 :: -> DFS Solution

    public boolean isEvenOddTree(TreeNode root) {
        Map<Integer,Integer> map=new HashMap<>();
        return solve(root,0,map);
    }

    public static boolean solve(TreeNode node, int level, Map<Integer,Integer> map) {
        if (node == null) return true;

        if (level % 2 == 0)
        {
            //Level is even
            if(node.val%2==0) return false;
            if(map.containsKey(level))
            {
                if(map.get(level)>=node.val)
                {
                    return false;
                }
                else {
                    map.put(level,node.val);
                }
            }
            else
            {
                map.put(level,node.val);
            }
        }
        else {
            //Level id odd
            if(node.val%2 == 1) return false;
            if(map.containsKey(level))
            {
                if(map.get(level)<=node.val)
                {
                    return false;
                }
                else {
                    map.put(level,node.val);
                }
            }
            else
            {
                map.put(level,node.val);
            }
        }

        boolean left=solve(node.left,level+1,map);
        boolean right=solve(node.right,level+1,map);

        return left && right;
    }
    public static void main(String[] args) {

    }
}
