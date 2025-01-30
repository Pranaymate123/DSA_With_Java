package Tree_DataStructure.Pep_Coding;

import java.util.LinkedList;
import java.util.Queue;

public class Check_CompleteNess_Of_The_Binary_Tree {

    //In complete binayr tree if you got a null node then after that you dont get any null node
    //and  if you get then it is not the complete binary tree



    public static boolean isCompleteTree(TreeNode root) {

        int countNodes=countNodes(root);
        int idx=1;

        return dfs(root,idx,countNodes);

    }

    public static boolean dfs(TreeNode root,int idx,int countNodes)
    {

        if(root==null) return true;
        if(idx>countNodes) return false;


        return dfs(root.left,2*idx,countNodes) &&  dfs(root.right,2*idx+1,countNodes);

    }
    public static  int countNodes (TreeNode root)
    {
        if(root==null) return 0;

        int left=countNodes(root.left);
        int right=countNodes(root.right);

        return 1+left+right;
    }





//     iterative/ Aprroach Level Order Traversal
//    public static boolean isCompleteTree(TreeNode root) {
//
//        Queue<TreeNode>  que=new LinkedList<>();
//        TreeNode node=null;
//        boolean seenNullNodeInPast=false;
//        que.add(root);
//        while (!que.isEmpty())
//        {
//            node=que.poll();
//
//            if(node==null)
//            {
//                seenNullNodeInPast=true;
//            }
//           else
//            {
//                if(seenNullNodeInPast)
//                {
//                    return false;
//                }
//                que.add(node.left);
//                que.add(node.right);
//            }
//        }
//        return true;
//    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(50);
        root.left=new TreeNode(25);
        root.left.left=new TreeNode(12);
        root.left.right=new TreeNode(37);


//        root.right=new TreeNode(75);
//        root.right.left=new TreeNode(62);
//        root.right.left.right=new TreeNode(70);
//        root.right.right=new TreeNode(87);

        System.out.println(isCompleteTree(root));
    }
}
