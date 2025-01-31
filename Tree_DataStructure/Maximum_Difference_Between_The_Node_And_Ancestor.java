package Tree_DataStructure;

public class Maximum_Difference_Between_The_Node_And_Ancestor {


    //Recursive Approach

    public int maxAncestorDiff(TreeNode root) {

        return solve(root,root.val,root.val);
    }


    public  static int  solve(TreeNode node,int max,int min)
    {
        if(node==null) return Math.abs(max-min);

        min=Math.min(min,node.val);
        max=Math.max(max,node.val);

        int leftDiff= solve(node.left,max,min);

        int rightDiff=solve(node.right,max,min);

        return Math.max(leftDiff,rightDiff);

    }


//    public int maxAncestorDiff(TreeNode root) {
//        if(root==null) return 0;
//        Queue<TreeNode> que=new LinkedList<>();
//        que.add(root);
//        int result=0;
//        TreeNode temp=null;
//        while (!que.isEmpty())
//        {
//            temp= que.poll();
//            result=Math.max(result,getMaxValue(root));
//
//            if(temp.left!=null)
//            {
//                que.add(temp.left);
//            }
//            if(temp.right!=null)
//            {
//                que.add(temp.right);
//            }
//        }
//        return result;
//    }
//
//    public static int getMaxValue(TreeNode node)
//    {
//        int maxValue=0;
//        int nodeVal=node.val;
//        Queue<TreeNode> que=new LinkedList<>();
//        que.add(node);
//        TreeNode temp=null;
//        while (!que.isEmpty())
//        {
//           temp= que.poll();
//           maxValue=Math.max(maxValue,Math.abs(nodeVal-temp.val));
//
//           if(temp.left!=null)
//           {
//               que.add(temp.left);
//           }
//           if(temp.right!=null)
//           {
//               que.add(temp.right);
//           }
//        }
//        return maxValue;
//    }


    public static void main(String[] args) {
        TreeNode root=new TreeNode(8);
        root.left=new TreeNode(3);
        root.left.right=new TreeNode(6);

        root.right=new TreeNode(10);

        Maximum_Difference_Between_The_Node_And_Ancestor obj=new Maximum_Difference_Between_The_Node_And_Ancestor();

        System.out.println(obj.maxAncestorDiff(root));
    }
}
