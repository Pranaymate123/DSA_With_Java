package Tree;



// * Definition for a binary tree node.
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class MaxPathSum {
}

class Solution {
    public int maxPathSum(TreeNode root) {
        int [] maxi=new int[1];
        maxi[0]=Integer.MIN_VALUE;
        maxSum(root,maxi);
        return maxi[0];

    }
    public static int maxSum(TreeNode root,int [] maxi)
    {
        if(root==null) return 0;

        int leftSum=Math.max(maxSum(root.left,maxi),0);
        int rightSum=Math.max(maxSum(root.right,maxi),0);

        maxi[0]=Math.max(maxi[0],leftSum+rightSum+root.val);

        return root.val + Math.max(leftSum,rightSum);
    }
}