package Tree_DataStructure.Pep_Coding;

import java.util.*;

public class Left_View_Of_Binary_Tree {

//    public  static ArrayList<Integer> leftView(TreeNode root) {
//        // code here
//
//
//        Queue<TreeNode> que=new LinkedList<>();
//        ArrayList<Integer> result=new ArrayList<>();
//        if(root ==null) return result;
//
//        que.add(root);
//        TreeNode node=null;
//        while (!que.isEmpty())
//        {
//            int size=que.size();
//            node=que.peek();
//            result.add(node.val);
//
//            while (size>0)
//            {
//                node = que.poll();
//                if(node.left!=null)
//                {
//                    que.add(node.left);
//                }
//                if(node.right!=null)
//                {
//                    que.add(node.right);
//                }
//
//                size--;
//            }
//        }
//
//        return result;
//    }


    public  static ArrayList<Integer> leftView(TreeNode root) {
        Map<Integer,TreeNode> map=new HashMap<>();

        ArrayList<Integer> result=new ArrayList<>();

        solve(root,map,0,result);

        return result;
    }

    public static  void solve(TreeNode root,Map<Integer,TreeNode> map,int level,ArrayList<Integer> result)
    {
        if(root==null) return;
        if(!map.containsKey(level))
        {
            map.put(level,root);
            result.add(root.val);
        }
        //goto left most
        if(root.left!=null)
        {
            solve(root.left,map,level+1,result);
        }
        if(root.right!=null)
        {
            solve(root.right,map,level+1,result);
        }
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

        System.out.println(leftView(root));
    }
}
