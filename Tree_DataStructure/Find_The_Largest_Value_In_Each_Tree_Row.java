package Tree_DataStructure;

import java.util.*;

public class Find_The_Largest_Value_In_Each_Tree_Row {

    ////Approach 1 using level order traversal
//    public List<Integer> largestValues(TreeNode root) {
//
//        List<Integer> result=new ArrayList<>();
//        Queue<TreeNode> que=new LinkedList<>();
//        que.add(root);
//        while (!que.isEmpty())
//        {
//            int size=que.size();
//            int max=Integer.MIN_VALUE;
//            while (size!=0)
//            {
//                TreeNode node=que.poll();
//                max=Math.max(max,node.val);
//                if(node.left!=null)
//                {
//                    que.add(node.left);
//                }
//
//                if(node.right!=null)
//                {
//                    que.add(node.right);
//                }
//                size--;
//            }
//            result.add(max);
//        }
//        return result;
//    }

    //// Approach 2 recursive DFS
    public static List<Integer> largestValues(TreeNode root) {
        Map<Integer,Integer> map=new TreeMap<>();
        List<Integer> result=new ArrayList<>();
        solve(root,result,0);
        return result;

    }

    public static void solve(TreeNode root, List<Integer> result,int level)
    {
        if(root==null) return;

        if(result.size()==level)
        {
            result.add(root.val);
        }
        else
        {
            if(result.get(level)<root.val)
            {
                result.remove(level);
                result.add(level,root.val);
            }
        }

        solve(root.left,result,level+1);

        solve(root.right,result,level+1);

    }


    public static void main(String[] args) {

    }
}
