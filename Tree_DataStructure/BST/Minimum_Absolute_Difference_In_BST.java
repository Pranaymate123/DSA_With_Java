package Tree_DataStructure.BST;

import java.util.ArrayList;
import java.util.List;

public class Minimum_Absolute_Difference_In_BST {

    public int getMinimumDifference(TreeNode root) {
       List<Integer> result=new ArrayList<>();
       solve(root,result);
       int ans=Integer.MAX_VALUE;
       for(int i=0;i<result.size()-1;i++)
       {
           ans=Math.min(ans,Math.abs(result.get(i)-result.get(i+1)));
       }
       return ans;
    }

    public static  void solve(TreeNode root, List<Integer> result)
    {
        if(root==null) return;
        solve(root.left,result);
        result.add(root.val);
        solve(root.right,result);
    }
    public static void main(String[] args) {

    }
}
