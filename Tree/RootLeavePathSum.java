package Tree;

import java.util.ArrayList;
import java.util.List;

public class RootLeavePathSum {

    public static boolean getAllPathsFromRootToLeaves(TreeNode root,int s,int sum)
    {
        if(root==null)
        {
            return false ;
        }
        if(root.left==null && root.right==null)
        {
            sum=sum+root.val;
            if(sum==s) return true;
            else return false;
        }

        if(getAllPathsFromRootToLeaves(root.left,s,sum) ||  getAllPathsFromRootToLeaves(root.right,s,sum))
        {
            return true;
        }
        sum=sum-root.val;
        return false;
    }
     static boolean hasPathSum(TreeNode root, int s) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        if(root==null) return false;
        return  getAllPathsFromRootToLeaves(root,s,0);


    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.left.right.left=new TreeNode(6);
        root.left.right.right=new TreeNode(7);
        root.right=new TreeNode(3);

        System.out.println(hasPathSum(root,4));
//        System.out.println(solve(root,7));
//        System.out.println(rootToLeaves(root));
    }
}
