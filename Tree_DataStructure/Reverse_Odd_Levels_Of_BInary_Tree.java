package Tree_DataStructure;

import java.util.*;

public class Reverse_Odd_Levels_Of_BInary_Tree {


    //Approach 1 using BFS
//    public TreeNode reverseOddLevels(TreeNode root) {
//
//        Queue<TreeNode> que=new LinkedList<>();
//        que.add(root);
//        int level=0;
//        while (!que.isEmpty())
//        {
//
//            List<TreeNode> lst=new ArrayList<>();
//            int size=que.size();
//            while (size!=0)
//            {
//                TreeNode curr=que.poll();
//                if(level%2==1)
//                {
//                    lst.add(curr);
//                }
//                if(curr.left!=null)
//                {
//                    que.add(curr.left);
//                }
//
//                if(curr.right!=null)
//                {
//                    que.add(curr.right);
//                }
//                size--;
//            }
//            if(level%2==1)
//            {
//                int start=0;
//                int end=lst.size()-1;
//                while (start<end)
//                {
//                    TreeNode first=lst.get(start);
//                    TreeNode last=lst.get(end);
//
//                    int temp=first.val;
//                    first.val=last.val;
//                    last.val=temp;
//
//                    start++;
//                    end--;
//                }
//            }
//
//            level++;
//        }
//        return root;
//    }

    ///Approach 2 : Using DFS

    public TreeNode reverseOddLevels(TreeNode root) {

        solve(root.left,root.right,1);
        return root;
    }

    public void solve(TreeNode leftNode,TreeNode rightNode,int level)
    {

        if(leftNode==null || rightNode==null) return;
        if(level%2==1)
        {
            int temp=leftNode.val;
            leftNode.val=rightNode.val;
            rightNode.val=temp;
        }

        solve(leftNode.left,rightNode.right,level+1);
        solve(leftNode.right,rightNode.left,level+1);
    }

    public static void main(String[] args) {

    }
}
