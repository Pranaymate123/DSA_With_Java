package Tree_DataStructure;


import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Right_Side_View {

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        solve(root,1,result);
        return result;
    }

    public static void solve(TreeNode root,int level,List<Integer> result)
    {
        if(root==null)
        {
            return;
        }
        if(result.size()<level)
        {
            result.add(root.val);
        }


        solve(root.right,level+1,result);
        solve(root.left,level+1,result);
    }

//    public static List<Integer> rightSideView(TreeNode root) {
//
//        List<Integer> result=new ArrayList<>();
//        Queue<TreeNode> que=new LinkedList<>();
//        que.add(root);
//        while (!que.isEmpty())
//        {
//            TreeNode node=null;
//            int n=que.size();
//            while (n!=0)
//            {
//                node=que.peek();
//                que.poll();
//                if(node.left!=null)
//                {
//                    que.add(node.left);
//                }
//                if(node.right!=null)
//                {
//                    que.add(node.right);
//                }
//                n--;
//            }
//            result.add(node.val);
//        }
//        return result;
//    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.right=new TreeNode(5);
        root.right=new TreeNode(3);
        root.right.right=new TreeNode(4);

        System.out.println(rightSideView(root));


    }
}
